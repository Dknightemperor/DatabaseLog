package com.db.logs.Logs.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Table(name = "access")
@Data
public class AccessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String name;

    private String requesterId;

    private String approverId;

    private String dbProvidedName;

    private Boolean isAccessGranted;

    @CreationTimestamp
    private Timestamp accessTimeout;

    @CreationTimestamp
    private Timestamp createdAt;

}
