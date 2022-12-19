package com.handlejsonrequest.controller;

import javax.validation.Valid;

import com.handlejsonrequest.exception.ExceptionResponse;
import com.handlejsonrequest.exception.JsonNotFoundException;
import com.handlejsonrequest.pojo.HandleJsonPojo;
import com.handlejsonrequest.service.HandleJsonRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleJsonRequest {

	@Autowired
	HandleJsonRequestService handleJsonRequestService;

//	@PostMapping("/handleJsonRequest")
//	public String handleJsonRequest(@Valid @RequestBody HandleJsonPojo handleJsonRequestPojo) {
//		System.out.println(handleJsonRequestPojo);
//		return handleJsonRequestService.handleJsonRequest(handleJsonRequestPojo);
//	}

	@PostMapping("/handleJsonRequest")
	public ResponseEntity<?> handleRequest(@RequestBody @Valid HandleJsonPojo handleJsonRequestPojo)
			throws JsonNotFoundException {
		try {
			return new ResponseEntity<>(handleJsonRequestService.handleJsonRequest(handleJsonRequestPojo),
					HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), new HttpHeaders(),HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getJsonRequest")
	public HandleJsonPojo getJsonResp() {
		return handleJsonRequestService.getJsonResponse();
	}
	
//	
//	@PostMapping("/handleJsonRequest")
//	public ResponseEntity<?> handleRequests(@RequestBody @Valid HandleJsonPojo handleJsonRequestPojo)
//			throws JsonNotFoundException {
//		
//		
//		
//	
//			return new ResponseEntity<>(e.getMessage(), new HttpHeaders(),HttpStatus.BAD_REQUEST);
//		}
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
