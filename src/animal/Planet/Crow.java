package animal.Planet;

public class Crow extends Bird{

	@Override
	public String getName() {
		return "Crow";
	}

	@Override
	public int getWeight() {
		return 2;
	}

	@Override
	public boolean isHousePet() {
		return false;
	}

	@Override
	public String getColour() {
		return "Black";
	}

}
