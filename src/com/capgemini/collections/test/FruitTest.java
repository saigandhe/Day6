package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class FruitTest {
  String[] fruits;
	@Test
	void test() {
		
		HashMap<String,ArrayList<String>> favouritefruit = new HashMap<>();
		
		fruits= new String[] {"Mango","apple","Guava"};
		favouritefruit.put("Naina", new ArrayList<String>(Arrays.asList(fruits)));
		fruits= new String[] {"Muskmealon","Custerdapple","Watermealon"};
		favouritefruit.put("Sirsha", new ArrayList<String>(Arrays.asList(fruits)));
		
		for (Entry<String, ArrayList<String>> entry : favouritefruit.entrySet()) {
			System.out.println("Key= "+entry.getKey()+ ",value = "+entry.getValue());
			
		}
	}

}
