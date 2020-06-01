package com.practice.pluralsightCourse.lambda_streams;

import java.util.function.Function;

@FunctionalInterface
public interface M1Comparator<T> {

	public int compare(T t1, T t2);

	// works for int as well(age) since int will be boxed to Integer
	public static <U> M1Comparator<U> comparing(Function<U, Comparable> f) {
		return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
	}

	public default M1Comparator<T> thenComparing(M1Comparator<T> cmp) {
		return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
	}

	public default M1Comparator<T> thenComparing(Function<T, Comparable> f) {
		return thenComparing(comparing(f));
	}

}
