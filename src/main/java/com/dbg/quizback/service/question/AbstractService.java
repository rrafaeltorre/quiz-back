package com.dbg.quizback.service.question;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dbg.quizback.model.AbstractModel;

public interface AbstractService<T extends AbstractModel<T>, P> {

	T save(T obj);

	void delete(P id);

	Optional<T> findOne(P id);

	Page<T> findAll(Pageable page);

}
