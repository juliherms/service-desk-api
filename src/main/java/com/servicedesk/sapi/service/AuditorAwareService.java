package com.servicedesk.sapi.service;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareService implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.of("JLV");
	}

}
