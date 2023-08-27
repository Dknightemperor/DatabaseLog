package com.db.logs.Logs.service.accesslog;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.dtos.RequestAccessDto;
import com.db.logs.Logs.model.AccessLog;
import com.db.logs.Logs.repos.AccessLogRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.GeneralConstants;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AccessServiceImpl implements AccessService{

    @Autowired
    AccessLogRepo accessLogRepo;

    @Override
    public AccessLog getAccess(RequestAccessDto requestAccessDto) throws DataException {
        try{
            AccessLog accessLog =  AccessLog.builder()
                    .name(requestAccessDto.getName())
                    .approverId(requestAccessDto.getAproverId())
                    .requesterId(requestAccessDto.getRequestId())
                    .dbProvidedName(requestAccessDto.getDatabase())
                    .isAccessGranted(false)
                    .isAccessRejected(false)
                    .build();
             return  accessLogRepo.save(accessLog);
        }catch (Exception e){
            log.error("Error occured while fetching List by Approver Id :{} and error is :",
                    requestAccessDto.getAproverId(),
                    e);
            throw new DataException(null,"Error occured while saving request Approver Id :{} and error is :",
                    500L, GeneralConstants.ERROR);
        }
    }

    @Override
    public List<AccessLog> fetchAccessLogs(RequestAccessDto requestAccessDto) throws DataException {
        try{
            Optional<List<AccessLog>> optionalAccessLogList =accessLogRepo.getByApproverId(requestAccessDto.getAproverId());
            if(optionalAccessLogList.isPresent()) {
                return  optionalAccessLogList.get();
            }else{
                throw new DataException(null,"Error occured while fetching List by Approver Id :{} and error is :",
                        500L, GeneralConstants.DATA_NOT_FOUND);
            }
        }catch (Exception e){
            log.error("Error occured while fetching List by Approver Id :{} and error is :",
                    requestAccessDto.getAproverId(),
                    e);
            throw new DataException(null,"Error occured while fetching List by Approver Id :{} and error is :",
                    500L, GeneralConstants.ERROR);
        }
    }

//    @Override
//    public AccessLog grantAccess(int accessLogId) throws DataException {
//        try{
//            Optional<AccessLog> accessLogOptional = accessLogRepo.findById(accessLogId);
//            if(accessLogOptional.isPresent()) {
//                AccessLog accessLog = accessLogOptional.get();
//                accessLog.setIsAccessGranted(true);
//                return accessLogRepo.save(accessLog);
//            }
//        }catch (Exception e){
//            log.error("Error occured while granting permission for id: {} and error is ", accessLogId, e);
//            throw new DataException(accessLogId, "Error occured while granting permission for id: {} and error is ",
//                    500L, GeneralConstants.ERROR);
//        }
//        return null;
//    }
//
//    @Override
//    public AccessLog rejectAccess(int accessLogId) throws DataException {
//        try{
//            Optional<AccessLog> accessLogOptional = accessLogRepo.findById(accessLogId);
//            if(accessLogOptional.isPresent()) {
//                AccessLog accessLog = accessLogOptional.get();
//                accessLog.setIsAccessRejected(true);
//                return accessLogRepo.save(accessLog);
//            }
//        }catch (Exception e){
//            log.error("Error occured while rejecting permission for id: {} and error is ", accessLogId, e);
//            throw new DataException(accessLogId, "Error occured while rejecting permission for id: {} and error is ",
//                    500L, GeneralConstants.ERROR);
//        }
//        return null;
//    }
}
