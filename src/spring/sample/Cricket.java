package spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports {

	String teamName;
	MedicalService medicalService;

	public Cricket() {

	}

	@Autowired
	public Cricket(@Qualifier("firstAidMedicalService") MedicalService medicalService, @Value("CSK") String teamName) {
		this.medicalService = medicalService;
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String provideInfo() {
		return "Played between two teams of 11 Players";
	}

	@Override
	public String getFirstAidInfo() {
		return medicalService.assist();
	}

}
