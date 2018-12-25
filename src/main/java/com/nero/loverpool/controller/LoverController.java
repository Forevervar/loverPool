package com.nero.loverpool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nero.loverpool.model.Lover;
import com.nero.loverpool.service.LoverService;

@RestController
@RequestMapping("/lover")
public class LoverController {
	
	private static Logger logger = LoggerFactory.getLogger(LoverController.class);
	
	@Autowired
	LoverService loverService;
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	@ResponseBody
	private Lover queryLoverByID(@RequestBody Lover lover) {
		logger.info("Query Lover by ID.!" + lover.getLovername());
		return loverService.getLover(lover);
	}
}
