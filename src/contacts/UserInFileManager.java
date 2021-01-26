package contacts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserInFileManager implements UserManager {
 //private BufferedWriter bufferedWriter ;
 private FileWriter fileWriter;
 File file;
	
	public  UserInFileManager(String file) throws IOException {
		this.file = new File(file);
		this.fileWriter = new FileWriter(file);
		//this.bufferedWriter = new BufferedWriter(fileWriter);
	}
	@Override
	public void setUser(User user) throws IOException {
		this.fileWriter.write(user.getFirstName()+";");
		this.fileWriter.write(user.getLastName()+";");
		this.fileWriter.write(user.getEmail()+";");
		this.fileWriter.write(user.getPhoneNumber()+";"+"\n");
	}
	

	@Override
	public void removeUser(User user) {
		

	}

	@Override
	public void updateUser(User user) {
		

	}
	@Override
	public User getUser(String FirstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
