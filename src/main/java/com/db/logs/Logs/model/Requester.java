package com.db.logs.Logs.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "requester")
@Data
public class Requester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String name;

    private String role;
}
