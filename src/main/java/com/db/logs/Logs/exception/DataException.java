package com.db.logs.Logs.exception;


public class DataException extends Exception{

    private Object data;
    private String message;
    private Long status;
    private String  code;

    public DataException(Object data, String message, Long status, String code) {
        super(message);
        this.data = data;
        this.message = message;
        this.status = status;
        this.code = code;
    }
}
