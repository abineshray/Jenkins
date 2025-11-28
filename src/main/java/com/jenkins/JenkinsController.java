package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@GetMapping(value = "getMyName")
	public String getMyName() {
		return "Abinesh D Ray";
	}
}
