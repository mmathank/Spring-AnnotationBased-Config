package spring.sample;

import org.springframework.stereotype.Component;

@Component
public class FirstAidMedicalService implements MedicalService {

	@Override
	public String assist() {
		return "Provide Water";
	}

}
