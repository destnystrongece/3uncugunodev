package odev;

public class InstructorManager {
	public void saveInstructor (Instructor instructor) {
		System.out.println("Kaydedildi"  + instructor.givenCourse);
		System.out.println("Kaydedildi"  + instructor.certificate);
		System.out.println("Kaydedildi"  + instructor.about);
		
		
	}
	public void saveInstructor(Instructor[] instructors) {
	  	  for(Instructor instructor : instructors) {
	  		  saveInstructor(instructor);
	  	  }
	}
}
