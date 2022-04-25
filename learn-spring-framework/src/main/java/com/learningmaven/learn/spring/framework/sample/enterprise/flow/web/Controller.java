package com.learningmaven.learn.spring.framework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningmaven.learn.spring.framework.sample.enterprise.flow.business.BusinessService;

// web layer
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;

	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
}