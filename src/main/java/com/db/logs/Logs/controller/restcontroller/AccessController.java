package com.db.logs.Logs.controller.restcontroller;


import com.db.logs.Logs.dtos.RequestAccessDto;
import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.AccessLog;
import com.db.logs.Logs.service.accesslog.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/access")
public class AccessController {


    @Autowired
    AccessService accessService;


    @PostMapping("/getAllRequest")
    public ResponseEntity<?> requestAccess(@RequestBody RequestAccessDto requestAccessDto) throws DataException {
        return new ResponseEntity<>(accessService.fetchAccessLogs(requestAccessDto), HttpStatus.OK);
    }

    @PostMapping("/request")
    public AccessLog requestForAccess(@RequestBody RequestAccessDto requestAccessDto) throws DataException {
        return accessService.getAccess(requestAccessDto);
    }

//    @GetMapping("/granted/{accesslogId}")
//    public AccessLog grantAccessLog(@PathVariable("accesslogId") int accessLogId) throws DataException {
//        return accessService.grantAccess(accessLogId);
//
//    }
//
//    @GetMapping("/rejected/{accesslogId}")
//    public AccessLog rejectAccessLog(@PathVariable("accesslogId") int accessLogId) throws DataException {
//        return accessService.rejectAccess(accessLogId);
//
//    }
}
