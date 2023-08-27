package com.db.logs.Logs.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Table
@Entity(name = "approver")
@Data
public class Approver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String name;

    private String role;
}
