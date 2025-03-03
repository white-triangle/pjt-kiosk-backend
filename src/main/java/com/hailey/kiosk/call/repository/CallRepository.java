package com.hailey.kiosk.call.repository;

import com.hailey.kiosk.call.entity.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository extends JpaRepository<Call, Integer> {
}
