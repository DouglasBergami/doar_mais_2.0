package com.doar.mais.doarMais.services.Exception;

import org.omg.SendingContext.RunTime;

public class DataIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    public  DataIntegrityException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
