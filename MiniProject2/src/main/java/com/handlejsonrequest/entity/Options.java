package com.handlejsonrequest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Options {

	@Id
//	@NotNull(message = "id should not be null")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@NotBlank(message = "text should not be blank")
	private String text;
	@NotNull(message = "sequence should not be null")
	private int sequence;
	@JsonBackReference
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "qdid", nullable = false)
	private QuestionDetails questionDetails;

	public Options() {
		super();
	}

	public Options(String text, int sequence, QuestionDetails questionDetails) {
		super();
		this.text = text;
		this.sequence = sequence;
		this.questionDetails = questionDetails;
	}

	public Options(String id, String text, int sequence, QuestionDetails questionDetails) {
		super();
		this.id = id;
		this.text = text;
		this.sequence = sequence;
		this.questionDetails = questionDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public QuestionDetails getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(QuestionDetails questionDetails) {
		this.questionDetails = questionDetails;
	}

//	@Override
//	public String toString() {
//		return "Options [id=" + id + ", text=" + text + ", sequence=" + sequence + ", questionDetails="
//				+ questionDetails + "]";
//	}

}
