package demo.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProject {
	
	@GetMapping(value = "/hello")
	String Message() {
		return "this is first project";
	}


}
