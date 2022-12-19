package com.handlejsonrequest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class QuestionDetails {

	@Id
	@NotNull(message = "id should not be null")
	private String id;
	@NotBlank(message = "text should not be blank")
	private String text;
	@NotBlank(message = "attributeType should not be blank")
	private String attributeType;
	@NotNull(message = "isreqiured should not be blank")
	private int isRequired;
	@NotNull(message = "sequence should not be null")
	@Min(value = 1)
	private int sequence;
	private String originalImageName;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionDetails", cascade = { CascadeType.ALL })
	private Set<Options> options = new HashSet<Options>();

	public QuestionDetails() {
		super();
	}

	public QuestionDetails(String id, String text, String attributeType, int isRequired, int sequence,
			String originalImageName, Set<Options> options) {
		super();
		this.id = id;
		this.text = text;
		this.attributeType = attributeType;
		this.isRequired = isRequired;
		this.sequence = sequence;
		this.originalImageName = originalImageName;
		this.options = options;
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

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public int getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getOriginalImageName() {
		return originalImageName;
	}

	public void setOriginalImageName(String originalImageName) {
		this.originalImageName = originalImageName;
	}

	public Set<Options> getOptions() {
		return options;
	}

	public void setOptions(Set<Options> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "QuestionDetails [id=" + id + ", text=" + text + ", attributeType=" + attributeType + ", isRequired="
				+ isRequired + ", sequence=" + sequence + ", originalImageName=" + originalImageName + ", options="
				+ options + "]";
	}

}
