package com.issamdrmas;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentInfo {
     @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     private String last_name;
     private int age;
     private String city;
     private Date birthDate;
     
     public StudentInfo(int id, String name, String last_name, int age, String city, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		this.city = city;
		this.birthDate = birthDate;
	}
     
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



     
}
