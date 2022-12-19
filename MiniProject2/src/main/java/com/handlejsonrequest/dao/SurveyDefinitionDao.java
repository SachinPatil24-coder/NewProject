package com.handlejsonrequest.dao;

import com.handlejsonrequest.entity.SurveyDefinition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SurveyDefinitionDao extends JpaRepository<SurveyDefinition, Integer>{

}
