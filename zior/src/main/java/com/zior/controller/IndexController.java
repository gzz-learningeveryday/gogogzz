package com.zior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
	
	@RequestMapping("/")
	
	/**
	  * 首页
	 */
	public String index() {
		return "index.html";
	}
	
}
