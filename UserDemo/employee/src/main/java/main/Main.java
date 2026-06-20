package main;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.*;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackages = {"main", "com.example"})
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.repository")
public class Main implements CommandLineRunner{
	@Autowired
	private EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		service.save(new Employee(1,"sathvik","CSE",115000.00,Date.valueOf("2026-08-03")));
		List<Employee> list=service.getAll();
		System.out.println(list);
	}
}
