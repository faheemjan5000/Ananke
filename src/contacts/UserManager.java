package contacts;

import java.io.IOException;

public interface UserManager {

	void setUser(User user) throws IOException;
	void removeUser(User user);
	void updateUser(User user);
	User getUser(String FirstName);
	
}
