package com.tutorial.studentadmission;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.StudentAdmissionController;


@Controller
public class StudentAdmissionController {
  @RequestMapping
  (value = "/AdmissionForm.html", method = RequestMethod.GET)
  public ModelAndView getAdmissionForm() {
  
  ModelAndView model = new ModelAndView("AdmissionForm"); 
  return model;
}
 
  @RequestMapping
(value ="/submitAdmissionForm.html",method = RequestMethod.POST)
public ModelAndView submitAdmissionForm(@RequestParam("studentName")String name,
		@RequestParam
		("studentHobby") String hobby)
{
	
	Student student1 = new Student();
	student1.setStudentName(name);
	student1.setStudentHobby(hobby);
	
	ModelAndView model = new ModelAndView("AdmissionSucess");
	model.addObject("message","Detail Submitted by you:: Name: "+name+ ",Hobby: " +hobby);
	model.addObject("headerMessage","enginnering college , India");
	model.addObject("student1",student1);
	return model;
	
}
}
