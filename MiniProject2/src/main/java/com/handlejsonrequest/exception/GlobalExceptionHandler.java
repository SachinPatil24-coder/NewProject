package com.handlejsonrequest.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

//	@ExceptionHandler(JsonNotFoundException.class)
//    public ResponseEntity<Map<String, String>> handlingMethodArgumentNotValidException(MethodArgumentNotValidException ex)
//    {
//        Map<String,String> response= new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error)->{
//            String fieldName=((FieldError) error).getField();
//            String message= error.getDefaultMessage();
//            response.put(fieldName, message);
//        });
//        return new ResponseEntity<Map<String, String>>(response,HttpStatus.BAD_REQUEST);
//    }
//	 @ExceptionHandler(JsonNotFoundException.class)
//	 @ResponseStatus(HttpStatus.BAD_REQUEST)
//	    public ResponseEntity<Object> handleExceptions( JsonNotFoundException exception, WebRequest webRequest) {
//	        ExceptionResponse response = new ExceptionResponse();
//	        response.setFieldName(PAGE_NOT_FOUND_LOG_CATEGORY);
//	        response.setError(PAGE_NOT_FOUND_LOG_CATEGORY);
//	        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//	        return entity;
//	    }
//	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(JsonNotFoundException.class)
//	public Map<String, String> handleValidationExceptions(
//	  MethodArgumentNotValidException ex) {
//	    Map<String, String> errors = new HashMap<>();
//	    ex.getBindingResult().getAllErrors().forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getDefaultMessage();
//	        errors.put(fieldName, errorMessage);
//	    });
//	    return errors;
//	}
//	
	

    @ExceptionHandler(JsonNotFoundException.class)
    public ResponseEntity<Object> handleExceptions( JsonNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
      //  response.setDateTime(LocalDateTime.now());
        //response.setMessage("Not found");
        
        response.setError("value is missing");
        response.setFieldName("correct the field value");
        
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
    }
	
	
	
	
	
	
	
	
}
