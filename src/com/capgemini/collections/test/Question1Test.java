package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collection.Car;
import com.capgemini.collection.Cellphone;
import com.capgemini.collection.Laptop;
import com.capgemini.collection.School;
import com.capgemini.collection.Television;

class Question1Test {

	
		

		@Test
		void testLaptop() {
			ArrayList<Laptop> laptop = new ArrayList<Laptop>();
			assertEquals(true, laptop.add(new Laptop("Dell","Inspiron15","Windows","I7")));
			//assertEquals(false, laptop.add(new Laptop("Dell","Inspiron15","Windows","I7")));
			assertEquals(true, laptop.add(new Laptop("HP","Inspiron15","Linux","I5")));
			assertEquals(true, laptop.add(new Laptop("Lenevo","Inspiron17","Windows","I3")));
			
			
				assertEquals(3, laptop.size());
				
				for (Laptop laptop2 : laptop) {
					System.out.println(laptop2);
				}
				

			}
			
		
		@Test
		void testCar() {
			ArrayList<Car> car = new ArrayList<>();
			assertEquals(true, car.add(new Car("BMW","BMW056",2001,10_00_000)));
			assertEquals(true, car.add(new Car("Swift","desire",2005,50_000)));
			assertEquals(true, car.add(new Car("Hundai","elite",2008,51_00_000)));
			
				assertEquals(3, car.size());
				
				for (Car car2 : car) {
					System.out.println(car2);
				}
			
		}
		
		@Test
		void testCellphone() {
			ArrayList<Cellphone> cellphone = new ArrayList<>();
			assertEquals(true, cellphone.add(new Cellphone("iphone","X","nice","ios",1_00_000)));
			assertEquals(true, cellphone.add(new Cellphone("Moto","G4","bad","marshmellow",10_000)));
			assertEquals(true, cellphone.add(new Cellphone("Lenevo","k5note","good","Oreo",10_000)));
			
				assertEquals(3, cellphone.size());
				
				for (Cellphone cellphone2 : cellphone) {
					System.out.println(cellphone2);
					
				}
		}
		
		@Test
		void testTelevision() {
			ArrayList<Television> television  = new ArrayList<>();
			assertEquals(true, television.add(new Television("Onida","LED",false,1_00_000)));
			assertEquals(true, television.add(new Television("sony","plasma",true,2_00_000)));
			assertEquals(true, television.add(new Television("LG","LCD",true,3_00_000)));
			
			assertEquals(3, television.size());
			
			for (Television television2 : television) {
				System.out.println(television2);
				
			}
			
		}
		
		@Test
		void testSchool() {
			ArrayList<School> school  = new ArrayList<>();
			assertEquals(true, school.add(new School("Naina","Hyderabad","Vikas","Hyderabad",10)));
			assertEquals(true, school.add(new School("Nikki","Siddipet","Goutham","Medak",10)));
			assertEquals(true, school.add(new School("Sirsha","vizag","Blossoms","Hyderabad",10)));
			
			assertEquals(3, school.size());
			
			for (School school2 : school) {
				System.out.println(school2);
				
			}
			
		}

	

}
