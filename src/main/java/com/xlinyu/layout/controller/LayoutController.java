package com.xlinyu.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController {

	@RequestMapping("/layout")
	public String layout(){
		
		return "layout/layout";
	}
	
	
	@RequestMapping("/north")
	public String north(){
		
		return "layout/north";
	}
	
	@RequestMapping("/west")
	public String west(){
		
		return "layout/west";
	}
	
	@RequestMapping("/south")
	public String south(){
		
		return "layout/south";
	}
	
	@RequestMapping("/east")
	public String east(){
		
		return "layout/east";
	}
	
}
