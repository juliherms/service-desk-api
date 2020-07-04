package com.servicedesk.sapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicedesk.sapi.model.System;
import com.servicedesk.sapi.service.SystemService;

@RestController
public class SystemController {

	@Autowired
	private SystemService service;

	@PostMapping("/systems")
	public System create(@RequestBody System system) {
		return service.save(system);
	}

	@GetMapping("/systems")
	public ResponseEntity<List<System>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/systems/{id}")
	public ResponseEntity<System> findById(@PathVariable(value = "id") Long id) {

		return ResponseEntity.ok().body(service.findById(id));
	}

	@DeleteMapping("/systems/{id}")
	public ResponseEntity<Void> delete(@PathVariable(value = "id") Long id) {

		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
