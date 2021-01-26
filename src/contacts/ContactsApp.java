package contacts;

import java.io.IOException;
import java.util.Scanner;


public class ContactsApp {

	private Scanner scanner;
	
	public User mainMenu() {
		User user = null;
		int i=0;
		System.out.println("Choose from the following Menu!");
		System.out.println("Press 1 to insert a Person in File!");
		System.out.println("Press 2 to remove a Person from File!");
		System.out.println("Press 3 to update a Person in File!");
		System.out.println("Press 0 to exit!");
		
		switch (i) {
		case 1 :
			 user = getUserData();
			 break;
		
		case 2 :
			user = getUserNameToRemove();
			break;
		case 3 :
		 	user = updateUser();
		    break;
		default :
		System.out.println("Thank you!");
		break;
			
		}
		return user;
	}
	private User updateUser() {
		
		return null;
	}
	private User getUserNameToRemove() {
		// TODO Auto-generated method stub
		return null;
	}
	private User getUserData() {
		Scanner scanner = new Scanner(System.in);
		
		return null;
	}
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String fileName = "/home/faheem/Users.txt";
		UserManager userManager = new UserInFileManager(fileName);
		

	}

}
