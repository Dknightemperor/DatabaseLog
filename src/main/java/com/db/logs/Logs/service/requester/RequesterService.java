package com.db.logs.Logs.service.requester;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Requester;

public interface RequesterService {
    Requester save(Requester requester) throws DataException;
}
