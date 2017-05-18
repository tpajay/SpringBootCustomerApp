package tpajay.springboot.jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerSpringBootApp {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerSpringBootApp.class);
	
	public static void main(String args[]) {
		
		//SpringApplication.run(CustomerSpringBootApp.class, args);
		SpringApplication.run(CustomerSpringBootApp.class);
	
	}
	
	@Bean
	public CommandLineRunner demo(CustomerJpaRepository repository) {
		return (args) -> {
			
			
			repository.save(new Customer("Eddie", "Vedder"));
			repository.save(new Customer("Bob", "Marley"));
			repository.save(new Customer("Kurt", "Cobain"));
			repository.save(new Customer("Anthony", "Kiedis"));

			// List all Customers to LOG
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
		};
	}

}
