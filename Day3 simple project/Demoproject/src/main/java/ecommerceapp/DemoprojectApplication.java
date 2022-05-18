package ecommerceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "demo.example")
public class DemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
	}

}
