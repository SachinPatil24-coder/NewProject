package com.handlejsonrequest.entity;

import java.util.Set;

public class SurveyDetails {

	private Set<QuestionDetails> questionDetails;

	public SurveyDetails() {
		super();
	}

	public SurveyDetails(Set<QuestionDetails> questionDetails) {
		super();
		this.questionDetails = questionDetails;
	}

	public Set<QuestionDetails> getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(Set<QuestionDetails> questionDetails) {
		this.questionDetails = questionDetails;
	}

	@Override
	public String toString() {
		return "SurveyDetails [questionDetails=" + questionDetails + "]";
	}

}
