package com.sagar.comparator;

import java.util.Comparator;

public class IdRollNo implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRoll_no()-o2.getRoll_no();
	}

}
