package org.rishabh.springmvc.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.rishabh.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//use of Property editors
	@InitBinder
	public void customBindingController(WebDataBinder binder){
		binder.setDisallowedFields("address.city");
		SimpleDateFormat dateFormat  =  new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "date",new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value = "login.html",method=RequestMethod.GET)
	public ModelAndView loginControler(){
		ModelAndView model = new ModelAndView("InputForm");
		return model;
	}
	@ModelAttribute
	public void  commonMessageController(Model model){
		model.addAttribute("message", "Jaypee institute of information Technology");
	}

	@RequestMapping(value = "/loginSuccess.html",method=RequestMethod.POST)
	public ModelAndView loginSuccessController(@ ModelAttribute("student") Student student,BindingResult result){
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("InputForm");
			return model;
		}
		ModelAndView model = new ModelAndView("CompletedFormResult");
		return model;
	}
	

	
}
