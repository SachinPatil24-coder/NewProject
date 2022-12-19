package com.handlejsonrequest.serviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.handlejsonrequest.dao.QuestionDetailsDao;
import com.handlejsonrequest.dao.QuestionsDao;
import com.handlejsonrequest.dao.SurveyDefinitionDao;
import com.handlejsonrequest.entity.Options;
import com.handlejsonrequest.entity.QuestionDetails;
import com.handlejsonrequest.entity.SurveyDefinition;
import com.handlejsonrequest.entity.SurveyDetails;
import com.handlejsonrequest.exception.JsonNotFoundException;
import com.handlejsonrequest.pojo.HandleJsonPojo;
import com.handlejsonrequest.service.HandleJsonRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HandleJsonRequestServiceImpl implements HandleJsonRequestService {

	@Autowired
	SurveyDefinitionDao surveyDefinitionDao;

	@Autowired
	QuestionDetailsDao questionDetailsDao;

	@Autowired
	QuestionsDao questionsDao;

	@Override
	@Transactional
	public String handleJsonRequest(HandleJsonPojo handleJsonRequestPojo) {

		SurveyDefinition surveyDefinition = handleJsonRequestPojo.getSurveyDefinition();
//		surveyDefinition.setParticipantIds(handleJsonRequestPojo.getSurveyDefinition().getParticipantIds().toString());
		surveyDefinitionDao.save(surveyDefinition);

		Set<QuestionDetails> qtList = handleJsonRequestPojo.getSurveyDetails().getQuestionDetails();

		for (QuestionDetails qt : qtList) {
			System.out.println("Hello");

			QuestionDetails qts = new QuestionDetails();
			qts.setId(qt.getId());
			qts.setAttributeType(qt.getAttributeType());
			qts.setIsRequired(qt.getIsRequired());
			qts.setOriginalImageName(qt.getOriginalImageName());
			qts.setSequence(qt.getSequence());
			qts.setText(qt.getText());
			questionDetailsDao.save(qts);
			Set<Options> hp = qt.getOptions();
			System.out.println("Options List" + hp);

			for (Options op : hp) {
				System.out.println("Options" + op);
				Options o = new Options();
				o.setId(op.getId());
				o.setSequence(op.getSequence());
				o.setText(op.getText());
				o.setQuestionDetails(qts);
				questionsDao.save(o);

			}
		}
		return "Data save succefully";
	}

	@Override
	public HandleJsonPojo getJsonResponse() {
		HandleJsonPojo hpresp = new HandleJsonPojo();
		SurveyDefinition surveyDefinition = surveyDefinitionDao.findById(1).get();
		SurveyDetails svdt = new SurveyDetails();
		List<QuestionDetails> ListOfQD = questionDetailsDao.findAll();
		Set<QuestionDetails> respSet = new HashSet<QuestionDetails>(ListOfQD);

		svdt.setQuestionDetails(respSet);
//		int i = 0;
//		for (QuestionDetails qd : ListOfQD) {
//
//			List<Options> op = questionsDao.findByQuestionDetails(qd);
//			Set<Options> hSet = new HashSet<Options>(op);
//
//			ListOfQD.get(i).setOptions(hSet);
//			System.out.println(ListOfQD.get(i).getOptions());
//			i++;
//		}
//

		hpresp.setSurveyDefinition(surveyDefinition);
		hpresp.setSurveyDetails(svdt);

		return hpresp;
	}

}
