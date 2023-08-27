package com.db.logs.Logs.service.approver;

import com.db.logs.Logs.exception.DataException;
import com.db.logs.Logs.model.Approver;

public interface ApproverService {
    public Approver save(Approver approver) throws DataException;
}
