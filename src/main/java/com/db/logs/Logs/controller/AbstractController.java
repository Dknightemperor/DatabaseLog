package com.db.logs.Logs.controller;

import org.springframework.http.ResponseEntity;

public class AbstractController {

    public ResponseEntity<?> buildError(Exception e){
        return null;
    }
}
