package mx.rememberme.mantras.sapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.rememberme.mantras.sapi.services.MantraManipulation;
import mx.rememberme.mantras.sapi.services.MantraManipulationImpl;

@Configuration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public MantraManipulation getMantraManipulation() {
		return new MantraManipulationImpl();
	}
}