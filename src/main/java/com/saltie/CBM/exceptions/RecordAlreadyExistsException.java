package com.saltie.CBM.exceptions;

public class RecordAlreadyExistsException extends RuntimeException{
    public RecordAlreadyExistsException(String message) {
        super(message);
    }
}
