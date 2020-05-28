package com.sim.algods;

import java.util.Comparator;

public class TestMain {

	public static void main(String[] args) {
	
		Comparator<String> s=NaturalOrderComparators.createNaturalOrderRegexComparator();
		System.out.println(s.toString());

	}

}
