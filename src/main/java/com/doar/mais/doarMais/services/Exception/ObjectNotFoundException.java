package com.doar.mais.doarMais.services.Exception;

public class ObjectNotFoundException extends RuntimeException{

    private static final long  serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
