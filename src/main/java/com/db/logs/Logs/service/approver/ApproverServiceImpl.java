package com.db.logs.Logs.service.approver;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Approver;
import com.db.logs.Logs.repos.ApproverRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.GeneralConstants;

@Service
@Slf4j
public class ApproverServiceImpl implements ApproverService{

    @Autowired
    ApproverRepo approverRepo;

    @Override
    public Approver save(Approver approver) throws DataException {
        try{
            return approverRepo.save(approver);
        }catch (Exception e){
            log.error("Error occured while saving approver and error is :",e);
            throw new DataException(approver,"Error occured while saving Approver", 500L, GeneralConstants.DATA_NOT_SAVED);
        }
    }
}
