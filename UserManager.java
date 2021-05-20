package odev;

public class UserManager {
	public void saveUser(User user) {
		System.out.println("Kaydedildi... " + user.id);
		System.out.println("Kaydedildi... " + user.firstName);
		System.out.println("Kaydedildi... " + user.lastName);
		System.out.println("Kaydedildi... " + user.email);
		System.out.println("Kaydedildi... " + user.job);
		
	}
	public void saveUser(User[] users) {
  	  for(User user : users) {
  		 saveUser(user);
  	  }
	}

}
