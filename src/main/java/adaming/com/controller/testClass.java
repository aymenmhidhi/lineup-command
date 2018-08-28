package adaming.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/command")
public class testClass {
	

@RequestMapping(value = "/hello", method = RequestMethod.GET)
public String hello(){
	
	return "hello";
	}	
	
	
}
