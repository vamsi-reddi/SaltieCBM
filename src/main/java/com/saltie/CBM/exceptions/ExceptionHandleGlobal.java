package com.saltie.CBM.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleGlobal {

    @ExceptionHandler
    public ResponseEntity<?> handle(RecordNotFoundException exc) {
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<?> handleRecordExistsExc(RecordAlreadyExistsException exc) {
        return new ResponseEntity<>(exc.getMessage() , HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity<?> handleGenericExc(Exception exc){
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
