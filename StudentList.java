package entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student-list")
public class StudentList {
	@XmlElement(name="student")
	public List<Student> studentList = new ArrayList<Student>();
	public StudentList() {
		System.out.println("list const");
	}
}
