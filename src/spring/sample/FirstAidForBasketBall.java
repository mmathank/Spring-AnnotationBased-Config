package spring.sample;

import org.springframework.stereotype.Component;

@Component
public class FirstAidForBasketBall implements MedicalService {

	@Override
	public String assist() {
		return "Need to take rest for 10 mins then drink water";
	}

}
