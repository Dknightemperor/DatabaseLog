package com.db.logs.Logs.repos;

import com.db.logs.Logs.model.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccessLogRepo extends JpaRepository<AccessLog, Integer> {

    @Query(name = "Select * from access_log where approver_id=:approverId and is_access_rejected is not true",nativeQuery = true)
    Optional<List<AccessLog>> getByApproverId(Long approverId);
}
