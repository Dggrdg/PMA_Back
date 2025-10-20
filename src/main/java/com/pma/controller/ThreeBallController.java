package com.pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pma.service.ThreeBallService;

@RestController
@RequestMapping("/pma")
@CrossOrigin(origins = "http://localhost:8090")
public class ThreeBallController {

	@Autowired
	ThreeBallService threeBallService;

	@PostMapping("/threeBall")
	public ResponseEntity<?> threeBall(@RequestParam MultipartFile file) {

		if (file.isEmpty()) {
			return ResponseEntity.badRequest().body("資料為空");
		} else {
			return threeBallService.threeBall(file);
		}
	}
}
