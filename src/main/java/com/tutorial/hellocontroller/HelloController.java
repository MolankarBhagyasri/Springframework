package com.tutorial.hellocontroller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.http.HttpRequest;

import javax. servlet.HttpConstraintElement;

import org.springframework.test.web.ModelAndViewAssert;

public class HelloController extends ModelAndViewAssert  {
	
	protected ModelAndViewAssert handleRequestInternal(HttpRequest request,
			HttpServletResponse response) throws Exception{
		
		ModelAndViewAssert  model = new ModelAndViewAssert("HelloPage");
		((Object) model).addObject("WelcomeMessage","hi user, welcome to first spring MVC Application");
		return model;
		
	}
}

	 
