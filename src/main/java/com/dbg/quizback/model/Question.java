package com.dbg.quizback.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Question {

	@Id
	ObjectId id;
	Statement statement;
	List<Response> responses;
	@Indexed
	List<Tag> tags;

}
