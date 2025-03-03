package com.hailey.kiosk.table.repository;

import com.hailey.kiosk.table.entity.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiningTableRepository extends JpaRepository<DiningTable, Integer> {
}
