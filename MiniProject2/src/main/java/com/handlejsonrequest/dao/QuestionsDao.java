package com.handlejsonrequest.dao;

import java.util.List;

import com.handlejsonrequest.entity.Options;
import com.handlejsonrequest.entity.QuestionDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsDao extends JpaRepository<Options, String>{

	List<Options> findByQuestionDetails(QuestionDetails qd);

}
