package com.db.logs.Logs.controller.restcontroller;


import com.db.logs.Logs.dtos.RequestAccessDto;
import com.db.logs.Logs.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class AccessController {


    @Autowired
    AccessService accessService;

    @PostMapping
    public ResponseEntity<?> requestAccess(@RequestBody RequestAccessDto requestAccessDto){
        return accessService.getAccess(requestAccessDto);

    }
}
