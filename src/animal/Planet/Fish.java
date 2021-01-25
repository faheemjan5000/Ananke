package animal.Planet;

public interface Fish extends Animal {

	void setType(String type);
	String getType();
	default void swim() {
		System.out.println("i can swim very well");
	}
}
