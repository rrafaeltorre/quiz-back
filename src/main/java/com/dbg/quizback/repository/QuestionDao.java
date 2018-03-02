package com.dbg.quizback.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dbg.quizback.model.Question;

@Repository
public interface QuestionDao extends MongoRepository<Question, ObjectId> {

}
