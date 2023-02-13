package ch.sbb.demoautoscalingopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAutoScalingOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAutoScalingOpenshiftApplication.class, args);
		System.out.println("Salut Marc");
		System.out.println("Salut Simon");
		System.out.println("Salut Roman");
	}

}
