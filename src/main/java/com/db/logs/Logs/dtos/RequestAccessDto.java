package com.db.logs.Logs.dtos;

import lombok.Data;

@Data
public class RequestAccessDto {

    Long requestId;
    String name;
    String password;
    String database;
    Long aproverId;

}
