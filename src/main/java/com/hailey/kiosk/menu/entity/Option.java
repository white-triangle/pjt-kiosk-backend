package com.hailey.kiosk.menu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private OptionGroup groupId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "extra_price")
    private Long extraPrice;
}
