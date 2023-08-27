package com.db.logs.Logs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Table
@Entity(name = "access_log")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccessLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "request_id")
    private Long requesterId;

    @Column(name = "approver_id")
    private Long approverId;

    @Column(name = "db_provided_name")
    private String dbProvidedName;

    @Column(name = "is_access_granted")
    private Boolean isAccessGranted= false;

    @Column(name = "is_access_rejected")
    private Boolean isAccessRejected= false;

    @CreationTimestamp
    @Column(name = "access_time_out")
    private Timestamp accessTimeout;

    @CreationTimestamp
    @Column(name = "access_time_given")
    private Timestamp accessTimeGive;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

}
