package com.db.logs.Logs.service;

import com.db.logs.Logs.dtos.RequestAccessDto;
import org.springframework.http.ResponseEntity;

public interface AccessService {

    public ResponseEntity getAccess(RequestAccessDto requestAccessDto);
}
