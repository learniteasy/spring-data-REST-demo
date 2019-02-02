package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Data REST builds on top of Spring MVC. It creates a collection of
 * Spring MVC controllers, JSON converters, and other beans needed to provide a
 * RESTful front end. These components link up to the Spring Data JPA backend.
 * Using Spring Boot this is all autoconfigured; if you want to investigate how
 * that works, you could start by looking at the RepositoryRestMvcConfiguration
 * in Spring Data REST.
 * 
 * @author arahee001c
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}