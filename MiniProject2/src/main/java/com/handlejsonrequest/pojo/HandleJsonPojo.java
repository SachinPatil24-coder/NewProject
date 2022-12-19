package com.handlejsonrequest.pojo;

import com.handlejsonrequest.entity.SurveyDefinition;
import com.handlejsonrequest.entity.SurveyDetails;

public class HandleJsonPojo {
	private SurveyDefinition surveyDefinition;
	private SurveyDetails surveyDetails;

	public HandleJsonPojo() {
		super();
	}

	public HandleJsonPojo(SurveyDefinition surveyDefinition, SurveyDetails surveyDetails) {
		super();
		this.surveyDefinition = surveyDefinition;
		this.surveyDetails = surveyDetails;
	}

	public SurveyDefinition getSurveyDefinition() {
		return surveyDefinition;
	}

	public void setSurveyDefinition(SurveyDefinition surveyDefinition) {
		this.surveyDefinition = surveyDefinition;
	}

	public SurveyDetails getSurveyDetails() {
		return surveyDetails;
	}

	public void setSurveyDetails(SurveyDetails surveyDetails) {
		this.surveyDetails = surveyDetails;
	}

	@Override
	public String toString() {
		return "HandleJsonRequestPojo [surveyDefinition=" + surveyDefinition + ", surveyDetails=" + surveyDetails + "]";
	}

}
