package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstExApplication {

	public static void main(String[] args) {
		System.out.println("this statement from the main spring boot application");
		SpringApplication.run(SpringBootFirstExApplication.class, args);
	}

}
