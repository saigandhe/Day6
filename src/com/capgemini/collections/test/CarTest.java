package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collection.Car;

class CarTest {

	@Test
	void test() {
		TreeSet<Car>cars=new TreeSet<>();
		assertEquals(true,cars.add(new Car("BMW","BMW056",2001,10_00_0000)));
		assertEquals(true,cars.add(new Car("Swift","desire",2005,50_00_000)));
		assertEquals(true,cars.add(new Car("Hundai","elite",2008,51_00_000)));
		  
		for (Car car : cars) {
			System.out.println(car); 
			
		}
	}

}
