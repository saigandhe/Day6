package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collection.Student1;

class StudendsOrderTest {

	@Test
	void test() {
		TreeSet<Student1>students=new TreeSet<>();
		assertEquals(true,students.add(new Student1("Nikki","ECE",47)));
		assertEquals(true,students.add(new Student1("Tipsi","CSE",27)));
		assertEquals(true,students.add(new Student1("Teju","ECE",57)));
		
		for (Student1 student1 : students) {
			System.out.println(student1);
			
		}
	}

}
