package odev;

public class StudentManager {
	public void saveStudent(Student student) {
		System.out.println("Kaydedildi"+ student.takenCourse);
	}
	public void saveStudent(Student[] students) {
	  	  for(Student student : students) {
	  		  saveStudent(student);
	  	  }
	}

}
