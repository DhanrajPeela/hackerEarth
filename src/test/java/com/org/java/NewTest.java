package com.org.java;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@Test(dataProvider = "dp")
	public void f(LinkedList<LinkedHashMap<String, String>> lst) {
		for (LinkedHashMap<String, String> linkedHashMap : lst) {
			System.out.println(System.getProperty("a"));
		}
		
	}

	@DataProvider
	public Object[] dp() {
		LinkedList<LinkedHashMap<String, String>> lst = new LinkedList<LinkedHashMap<String, String>>();
		for (int i = 0; i < 3; i++) {
			LinkedHashMap<String, String> mapTest = new LinkedHashMap<String, String>();
			mapTest.put("a", "Testa" + i);
			mapTest.put("b", "Testb" + i);
			lst.add(mapTest);
		}
		return new Object[] { lst };
	}
}
