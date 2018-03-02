package com.dbg.quizback.service.question;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.dbg.quizback.model.Question;
import com.dbg.quizback.repository.QuestionDao;

@Service
public class QuestionServiceImpl extends AbstractServiceImpl<Question, ObjectId> implements QuestionService {

	@Autowired
	private QuestionDao dao;

	@Override
	public MongoRepository<Question, ObjectId> getRepository() {
		return dao;
	}

}
