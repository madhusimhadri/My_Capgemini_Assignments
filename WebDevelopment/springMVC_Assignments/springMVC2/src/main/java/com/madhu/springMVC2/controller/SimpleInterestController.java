package com.madhu.springMVC2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController 
{
		@RequestMapping("/simpleInterest.html")
		public ModelAndView interestController(@ModelAttribute("simpleInterest") SimpleInterest simpleInterest)
		{
			ModelAndView mv= new ModelAndView("calculateSI");
			mv.addObject("result", simpleInterest.getInterest());
			return mv;
			
		}
}
