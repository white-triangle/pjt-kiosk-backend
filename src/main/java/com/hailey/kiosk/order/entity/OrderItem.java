package com.hailey.kiosk.order.entity;

import com.hailey.kiosk.menu.entity.Menu;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order orderId;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menuId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "total")
    private Long total;

    @Column(name = "status", nullable = false)
    private boolean status;


}
