package com.handlejsonrequest.service;

import com.handlejsonrequest.pojo.HandleJsonPojo;

public interface HandleJsonRequestService {

	public String handleJsonRequest(HandleJsonPojo handleJsonRequestPojo);

	public HandleJsonPojo getJsonResponse();
}
