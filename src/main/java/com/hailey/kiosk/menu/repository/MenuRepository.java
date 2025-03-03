package com.hailey.kiosk.menu.repository;

import com.hailey.kiosk.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
