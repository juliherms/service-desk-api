package com.servicedesk.sapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicedesk.sapi.model.System;

public interface SystemRepository extends JpaRepository<System, Long> {

}
