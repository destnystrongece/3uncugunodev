package odev;

public class Main {

     public static void main(String[] args) {
    	 
		Student student = new Student();
		student.id=1;
		student.firstName="Ece";
		student.lastName="Saglam";
		student.email="ece.sglmk@gmail.com";
		student.job="�grenci";
		student.takenCourse="Yaz�l�m Gelistirici Yetistirme Kamp� (JAVA-REACT)";
	    
		Instructor instructor = new Instructor();
		instructor.id=1000;
		instructor.firstName= "Engin";
		instructor.lastName="Demiro�";
		instructor.email="engindemirog@gmail.com";
		instructor.job="E�itmen";
		instructor.givenCourse="Nitelikli Yaz�l�mc� Geli�tirme E�itimleri";
		instructor.about="Anlatsak Roman olur";
		instructor.certificate="PMP,MCT";
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student};
		studentManager.saveStudent(students);
		
		InstructorManager instructorManager = new InstructorManager();
	
		Instructor[] instructors= {instructor};
		instructorManager.saveInstructor(instructors);
		
		UserManager userManager=new UserManager();
		User[] users = {student,instructor};
		userManager.saveUser(users);
		
		
		
	}

}
