package com.dbg.quizback.service.question;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.dbg.quizback.model.AbstractModel;

@Component
public abstract class AbstractServiceImpl<T extends AbstractModel<T>, P> implements AbstractService<T, P> {

	public abstract MongoRepository<T, P> getRepository();

	@Override
	public T save(T obj) {
		return getRepository().save(obj);
	}

	@Override
	public void delete(P id) {
		getRepository().deleteById(id);
	}

	@Override
	public Optional<T> findOne(P id) {
		return getRepository().findById(id);
	}

	@Override
	public Page<T> findAll(Pageable page) {
		return getRepository().findAll(page);
	}

}
