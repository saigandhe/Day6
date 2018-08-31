package com.capgemini.collection;

import java.util.Objects;

public class School {
	
	private String name;
	private String city;
	private String school;
	private String district;
	private int greatSchoolRanking;
	public School() {
		super();
		
	}
	public School(String name, String city, String school, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.school = school;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", school=" + school + ", district=" + district
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name,city,district);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return this.name==other.name && this.city==other.city && this.district==other.district;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	

	
}
