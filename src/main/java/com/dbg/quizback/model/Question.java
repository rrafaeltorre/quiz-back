package com.dbg.quizback.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Document
@ToString
public class Question extends AbstractModel<Question> {

	private static final long serialVersionUID = 1098203100036339444L;

	@Id
	ObjectId id;
	Statement statement;
	List<Response> responses;
	@Indexed
	List<Tag> tags;

	@Override
	public int compareTo(Question o) {
		return statement.getText().compareTo(o.getStatement().getText());
	}

}
