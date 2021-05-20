package odev;

public class Main {

     public static void main(String[] args) {
    	 
		Student student = new Student();
		student.id=1;
		student.firstName="Ece";
		student.lastName="Saglam";
		student.email="ece.sglmk@gmail.com";
		student.job="Ögrenci";
		student.takenCourse="Yazılım Gelistirici Yetistirme Kampı (JAVA-REACT)";
	    
		Instructor instructor = new Instructor();
		instructor.id=1000;
		instructor.firstName= "Engin";
		instructor.lastName="Demiroğ";
		instructor.email="engindemirog@gmail.com";
		instructor.job="Eğitmen";
		instructor.givenCourse="Nitelikli Yazılımcı Geliştirme Eğitimleri";
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
