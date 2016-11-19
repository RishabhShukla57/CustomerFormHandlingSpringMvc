package org.rishabh.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	/*public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}*/
	
	@RequestMapping(value="/welcome/{pathname}")
	public ModelAndView test(@PathVariable("pathname") String userName){
		ModelAndView model = new ModelAndView("home");
		model.addObject("message", "the first spring mvc at path"+userName);
		return model;
	}
	
	
}
