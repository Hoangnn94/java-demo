package com.hoangnn1.demo.form;

public class CreateStudentForm {
	private String name;
	private String age;
	private String dateOfBirth;
	private Float score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "CreateStudentForm [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", score=" + score
				+ "]";
	}
	
	
}
