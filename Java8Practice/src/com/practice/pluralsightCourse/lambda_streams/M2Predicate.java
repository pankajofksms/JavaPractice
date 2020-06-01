package com.practice.pluralsightCourse.lambda_streams;

@FunctionalInterface
public interface M2Predicate<T> {

	public boolean test(T t);

	public default M2Predicate<T> and(M2Predicate<T> other){
		return t -> test(t) && other.test(t); 
	}

	public default M2Predicate<T> or(M2Predicate<T> other){
		return t -> test(t) || other.test(t);
	}

	public static <T> M2Predicate<T> equalsTo(T other) {
		return s -> s.equals(other);
	}
}
