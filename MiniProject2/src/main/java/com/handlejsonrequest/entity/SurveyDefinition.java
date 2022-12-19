package com.handlejsonrequest.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SurveyDefinition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer surveydefid;

	private String name;
	private int minutesToExpire;
	private int surveyCadenceId;
	private String description;
	private String[] participantIds;

	public SurveyDefinition() {
		super();
	}

	public SurveyDefinition(String name, int minutesToExpire, int surveyCadenceId, String description,
			String[] participantIds) {
		super();
		this.name = name;
		this.minutesToExpire = minutesToExpire;
		this.surveyCadenceId = surveyCadenceId;
		this.description = description;
		this.participantIds = participantIds;
	}

	public SurveyDefinition(Integer surveydefid, String name, int minutesToExpire, int surveyCadenceId,
			String description, String[] participantIds) {
		super();
		this.surveydefid = surveydefid;
		this.name = name;
		this.minutesToExpire = minutesToExpire;
		this.surveyCadenceId = surveyCadenceId;
		this.description = description;
		this.participantIds = participantIds;
	}

	public Integer getSurveydefid() {
		return surveydefid;
	}

	public void setSurveydefid(Integer surveydefid) {
		this.surveydefid = surveydefid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinutesToExpire() {
		return minutesToExpire;
	}

	public void setMinutesToExpire(int minutesToExpire) {
		this.minutesToExpire = minutesToExpire;
	}

	public int getSurveyCadenceId() {
		return surveyCadenceId;
	}

	public void setSurveyCadenceId(int surveyCadenceId) {
		this.surveyCadenceId = surveyCadenceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getParticipantIds() {
		return participantIds;
	}

	public void setParticipantIds(String[] participantIds) {
		this.participantIds = participantIds;
	}

	@Override
	public String toString() {
		return "SurveyDefinition [surveydefid=" + surveydefid + ", name=" + name + ", minutesToExpire="
				+ minutesToExpire + ", surveyCadenceId=" + surveyCadenceId + ", description=" + description
				+ ", participantIds=" + Arrays.toString(participantIds) + "]";
	}

}
