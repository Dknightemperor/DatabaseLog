package com.db.logs.Logs.service;

import com.db.logs.Logs.dtos.RequestAccessDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccessServiceImpl implements AccessService{

    @Autowired


    @Override
    public ResponseEntity getAccess(RequestAccessDto requestAccessDto) {

        return null;
    }
}
