package com.handlejsonrequest.exception;

public class ExceptionResponse {
	String fieldName;
	String error;

	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionResponse(String fieldName, String error) {
		super();
		this.fieldName = fieldName;
		this.error = error;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
