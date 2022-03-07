package com.tutorial.hellocontroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.test.web.ModelAndViewAssert;

@Controller

public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndViewAssert helloWorld(@PathVariable("userName") String name) {
		
		 ModelAndViewAssert model = new ModelAndViewAssert("HelloPage");
		 ((Object) model).addObject("mesage","hello world"+name);
		 return model;
}
	
	}
