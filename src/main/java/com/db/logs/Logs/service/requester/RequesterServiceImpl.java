package com.db.logs.Logs.service.requester;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Requester;
import com.db.logs.Logs.repos.RequesterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.GeneralConstants;

@Service
@Slf4j
public class RequesterServiceImpl implements RequesterService{

    @Autowired
    RequesterRepo requesterRepo;

    public Requester save(Requester requester) throws DataException {
        try {
            return requesterRepo.save(requester);
        }catch (Exception e){
            log.error("Error occured while saving Requester and error is ",e);

        }
        throw new DataException(null, "Error while savind Requester",500L, GeneralConstants.DATA_NOT_SAVED);
    }
}
