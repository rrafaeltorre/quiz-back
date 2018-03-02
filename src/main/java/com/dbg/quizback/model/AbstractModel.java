package com.dbg.quizback.model;

import java.io.Serializable;

public abstract class AbstractModel<T> implements Serializable, Comparable<T> {

	private static final long serialVersionUID = 5579388147572869554L;

	public abstract String toString();

}
