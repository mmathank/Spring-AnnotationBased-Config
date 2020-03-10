package spring.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationBasedConfigApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cricket cricket = context.getBean("cricket", Cricket.class);
		System.out.println("Information About Cricket: " + cricket.provideInfo());
		System.out.println("FirstAid: " + cricket.getFirstAidInfo());
		System.out.println("Team Name: " + cricket.getTeamName());
		
		BasketBall basketBall = context.getBean("basketBall", BasketBall.class);
		basketBall.setTeamName("LosAngelsLakers");
		System.out.println("Information About Basket Ball: " + basketBall.provideInfo());
		System.out.println("FirstAid: " + basketBall.getFirstAidInfo());
		System.out.println("Team Name: " + basketBall.getTeamName());
		
		context.close();
	}

}
