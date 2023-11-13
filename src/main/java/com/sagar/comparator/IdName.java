package com.sagar.comparator;

import java.util.Comparator;

public class IdName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
