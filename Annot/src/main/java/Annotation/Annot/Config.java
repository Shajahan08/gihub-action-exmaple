package Annotation.Annot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Annotation.Annot.Service.Hall;
import Annotation.Annot.Service.Home;

@Configuration
public class Config {

	@Bean
	 public Home home()
	 {
		return new Hall();
	 }
	
}
