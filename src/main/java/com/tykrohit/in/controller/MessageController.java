package com.tykrohit.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	private Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/welcome")
	public String getMessageWelcome() {
		logger.debug("debug from getMessageWelcome()  call");
		logger.info("getMessageWelcome()  started");
		logger.info("getMessageWelcome() method executed for wellccome msg");
		logger.warn("warn msg from getMessageWelcome()  ");
		logger.info("getMessageWelcome()  ended");
		try {
			int i = 10/0;
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			// TODO: handle exception
		}
		return " wellcome to logging projet";
	}

}
