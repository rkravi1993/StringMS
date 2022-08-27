package com.wipro.apple.poc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.apple.poc.api.service.StringMSService;

@RestController
@RequestMapping("/api/string")
public class StringMSController {
	@Autowired
	private StringMSService stringOpsService;

	@GetMapping("/reverseString")
	public ResponseEntity<String> reverseString(@RequestParam("input") String input) {
		String result = stringOpsService.reverseString(input);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/reverseStringUpperCase")
	public ResponseEntity<String> reverseStringUpperCase(@RequestParam("input") String input) {
		String result = stringOpsService.reverseString(input);
		return new ResponseEntity<>(result.toUpperCase(), HttpStatus.OK);
	}

	@GetMapping("/length")
	public ResponseEntity<Integer> length(@RequestParam("input") String input) {
		Integer length = stringOpsService.stringLength(input);
		return new ResponseEntity<>(length, HttpStatus.OK);
	}
}
