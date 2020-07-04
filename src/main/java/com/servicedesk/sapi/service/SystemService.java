package com.servicedesk.sapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicedesk.sapi.repository.SystemRepository;
import com.servicedesk.sapi.exception.ResourceNotFoundException;
import com.servicedesk.sapi.model.System;

@Service
public class SystemService {

	@Autowired
	private SystemRepository repo;

	public System save(System s) {
		return repo.save(s);
	}

	public List<System> findAll() {
		return repo.findAll();
	}

	public System findById(Long id) {

		System system = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("System not found " + id));

		return system;

	}

	public void delete(Long id) {

		System s = findById(id);
		repo.delete(s);
	}
}
