package com.vinith.moderation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "content-moderation")
public class ContentModerationController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Hello world...";
	}
	
}
