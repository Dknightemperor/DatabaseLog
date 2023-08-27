package com.db.logs.Logs.repos;

import com.db.logs.Logs.model.Requester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequesterRepo extends JpaRepository<Requester, Long> {
}
