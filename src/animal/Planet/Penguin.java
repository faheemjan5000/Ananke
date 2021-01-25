package animal.Planet;

public class Penguin extends Bird{

	@Override
	public String getName() {
		return "Penguin";
	}

	@Override
	public int getWeight() {
		return 3;
	}

	public boolean isHousePet() {
		return true;
	}

	@Override
	public String getColour() {
		return "Blue";
	}

}
