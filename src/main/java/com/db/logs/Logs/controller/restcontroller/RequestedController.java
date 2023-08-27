package com.db.logs.Logs.controller.restcontroller;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Requester;
import com.db.logs.Logs.service.requester.RequesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requester")
public class RequestedController {

    @Autowired
    RequesterService requesterService;

    @PostMapping("/save")
    public ResponseEntity<?> saveRequester(@RequestBody Requester requester) throws DataException {
        return new ResponseEntity(requesterService.save(requester), HttpStatus.OK);
    }
}
