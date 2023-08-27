package com.db.logs.Logs.service.accesslog;

import com.db.logs.Logs.dtos.RequestAccessDto;
import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.AccessLog;

import java.util.List;

public interface AccessService {

    public AccessLog getAccess(RequestAccessDto requestAccessDto) throws DataException;

    public List<AccessLog> fetchAccessLogs(RequestAccessDto requestAccessDto) throws DataException;

//    public AccessLog grantAccess(int acessLogId) throws DataException;
//
//    public AccessLog rejectAccess(int accessLogId) throws DataException;
}
