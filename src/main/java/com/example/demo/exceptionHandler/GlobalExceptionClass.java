package com.example.demo.exceptionHandler;

import com.example.demo.model.ErrorMessageInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionClass {



@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourseNotFoundException
        (ResourceNotFoundException resourceNotFoundException, WebRequest webRequest)
{
    ErrorMessageInfo errorMessageInfo=new ErrorMessageInfo(
            resourceNotFoundException.getMessage(),
            new Date(),
            webRequest.getDescription(false));
    return new ResponseEntity(errorMessageInfo, HttpStatus.NOT_FOUND);
}


@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> customizedValidationError
        (MethodArgumentNotValidException exception)
{
    ErrorMessageInfo errorMessageInfo=new ErrorMessageInfo(
            exception.getFieldError().getDefaultMessage(),
            new Date(),
            "Validation Error");
    return new ResponseEntity<>(errorMessageInfo,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleAllException
        (Exception exception,WebRequest webRequest)
{
    ErrorMessageInfo errorMessageInfo=new ErrorMessageInfo(
            exception.getMessage(),new Date(),webRequest.getDescription(false));
    return new ResponseEntity(errorMessageInfo, HttpStatus.INTERNAL_SERVER_ERROR);
}



}
