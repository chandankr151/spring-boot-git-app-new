package com.chandan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeRestController {

	@GetMapping(path = "/getId")
	public ResponseEntity<?> getJsessionId(HttpServletRequest request) {
		String jsessionId = request.getSession().getId();
		return new ResponseEntity<>("JSESSION_ID: " + jsessionId, HttpStatus.OK);
	}
}
