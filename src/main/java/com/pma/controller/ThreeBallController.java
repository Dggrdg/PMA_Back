package com.pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.service.ThreeBallService;

@RestController
@RequestMapping("/pma")
@CrossOrigin(origins = "http://localhost:8090")
public class ThreeBallController {

	@Autowired
	ThreeBallService threeBallService;

	@PostMapping("/threeBall")
	public ResponseEntity<?> threeBall() {

		return threeBallService.threeBall();
	}
}
