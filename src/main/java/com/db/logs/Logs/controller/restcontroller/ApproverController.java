package com.db.logs.Logs.controller.restcontroller;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Approver;
import com.db.logs.Logs.service.approver.ApproverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/approver")
public class ApproverController {

    @Autowired
    ApproverService approverService;

    @PostMapping("/save")
    public ResponseEntity<?> saveApprover(@RequestBody Approver approver) throws DataException {
        return new ResponseEntity<>(approverService.save(approver), HttpStatus.OK);
    }
}
