package com.hailey.kiosk.order.repository;

import com.hailey.kiosk.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
