package parsing.xml;

public class Employee {
	
private String id;
private String firstName;
private String lastName;
private String location;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

public Employee(String id, String firstName, String lastName, String location) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.location = location;
}
public String toString() {
	StringBuilder sb = new StringBuilder("[ ");
	sb.append("id : ").append(this.id);
	sb.append("; firstName : ").append(this.firstName);
	sb.append("; lastName : ").append(this.lastName);
	sb.append("; location : ").append(this.location);
	sb.append(" ]").append('\n');
	
	return sb.toString();
}
public Employee() {
	
}


}
