package com.generic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class GenericExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Object> setOfAnyType = new HashSet<Object>();
		setOfAnyType.add("String");
		
		Set<?> setOfUnknownType = new LinkedHashSet<String>();
		setOfUnknownType = new LinkedHashSet<Integer>();
		
		/*
		 * But Inheritance on type parameter is not supported means Set<Object>
		 * will not accept Set<String> as per following Generics code.
		 */
		// Set<Object> setOfObject = new HashSet<String>();
		
		Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>();
		setOfAllSubTypeOfNumber = new HashSet<Float>();
		
	}
	
}
