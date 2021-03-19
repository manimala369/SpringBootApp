package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;

@SpringBootApplication
public class Empapp2Application implements CommandLineRunner{
	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Empapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		  //System.out.println("records are saved...");
		
		 empService.save(new Employee("mani",45)); empService.save(new
		 Employee("vinne", 34)); empService.save(new Employee("vedu", 21));
		 empService.save(new Employee("ganta", 14)); empService.save(new 
		 Employee("lucky", 8));
		 
		 
	}

}
