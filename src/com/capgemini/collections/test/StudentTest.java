package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		
		ArrayList<String> students=new ArrayList<String>();
		students.add("Naina");
		students.add("BPK");
		students.add("Pikachu");
		students.add("Munnu");
		students.add("Takla");
		
		for (String student : students) {
			System.out.println(student);
			
		}


	}

}
