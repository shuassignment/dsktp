package com.cg.rest.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.restservice.entity.Address;
import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.repo.EmployeeRepository;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repository) {
		return(args)->{
			repository.save(new Employee(101, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(102, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(103, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(104, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(105, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(106, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
			repository.save(new Employee(107, (double) 15000, "Shubham", new Address(104, "Vrundavan", "Airoli", "Mumbai", 445203)));
		};
	
	};
	
}

