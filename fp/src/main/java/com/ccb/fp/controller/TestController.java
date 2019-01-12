package com.ccb.fp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
	@RequestMapping("/addFp")
	public String addFp() {
		return "this is a spring boot app!!!";
	}
}
