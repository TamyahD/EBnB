package EBNB.Ebnb;

import EBNB.Ebnb.service.ShelterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbnbApplication.class, args);
	}


}
