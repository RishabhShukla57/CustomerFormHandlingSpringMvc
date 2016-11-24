package org.rishabh.springmvc.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.rishabh.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
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
	public ModelAndView loginSuccessController(@ ModelAttribute("student") Student student){
		ModelAndView model = new ModelAndView("CompletedFormResult");
		return model;
	}
}
