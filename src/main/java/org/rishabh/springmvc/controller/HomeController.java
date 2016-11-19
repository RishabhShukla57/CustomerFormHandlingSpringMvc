package org.rishabh.springmvc.controller;

import java.io.IOException;
import java.util.Map;

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
	public ModelAndView test(@PathVariable Map<String,String> pathVars){
		ModelAndView model = new ModelAndView("home");
		model.addObject("message", "the first spring mvc at path"+pathVars.get("pathname"));
		return model;
	}
	
	
}
