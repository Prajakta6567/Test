package entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private String grade;
	public Student() {
		super();
	}
	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
