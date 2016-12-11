package org.rishabh.springmvc.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.rishabh.springmvc.model.LoginForm;
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
	public static ResourceBundle settings = ResourceBundle.getBundle("config");
	
	@InitBinder
	public void customBindingController(WebDataBinder binder){
		binder.setDisallowedFields("address.city");
		SimpleDateFormat dateFormat  =  new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "date",new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value = "/loginFormCheck.html",method =RequestMethod.POST)
	public String interceptorLogin(Model model,HttpServletRequest request, LoginForm loginForm){
		String password = loginForm.getPassword();
		String username = loginForm.getUsername();
		String dbusername =settings.getObject("username").toString();
		String dbpassword = settings.getObject("password").toString();
		if(username!=null && password!=null){
			if(password.equalsIgnoreCase(dbpassword)  && username.equalsIgnoreCase(dbusername)){
				request.getSession().setAttribute("LOGIN_INF", loginForm);
				return "redirect:/login.html";
			}else{
				return "redirect:loginFailed.html";
			}
		}else{
			return "redirect:loginFailed.html";
		}	
	}
	
	
	@RequestMapping(value = "/loginFailed.html",method=RequestMethod.GET)
	public ModelAndView loginFailedControler(){
		ModelAndView model = new ModelAndView("LoginFailed");
		return model;
	}
	
	
	@RequestMapping(value = "login.html",method=RequestMethod.GET)
	public ModelAndView loginControler(){
		ModelAndView model = new ModelAndView("InputForm");
		return model;
	}
	
	@RequestMapping(value = "loginCheck.html",method=RequestMethod.GET)
	public ModelAndView loginCheck(){
		ModelAndView model = new ModelAndView("LoginForm");
		return  model;
	}
	
	@ModelAttribute
	public void  commonMessageController(Model model){
		model.addAttribute("message", "Jaypee institute of information Technology");
	}

	@RequestMapping(value = "/loginSuccess.html",method=RequestMethod.POST)
	public ModelAndView loginSuccessController(@Valid @ ModelAttribute("student") Student student,BindingResult result){
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("InputForm");
			return model;
		}
		ModelAndView model = new ModelAndView("CompletedFormResult");
		return model;
	}
	
}
