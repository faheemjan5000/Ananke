package animal.Planet;

public class Cow implements Mammals {

	private String cowName;
	private String cowType;
	private int weight;
	
	public Cow(String tigerName, String tigerType,int weight) {
		super();
		this.cowName = tigerName;
		this.cowType = tigerType;
		this.weight=weight;
	}
	@Override
	public String getName() {
		return this.cowName;
	}
	@Override
	public int getWeight() {
		return this.weight;
	}
	@Override
	public boolean isHousePet() {
		return true;
	}

	@Override
	public boolean isCarnivore() {
		return false;
	}

	@Override
	public boolean isHerbivore() {
		return true;
	}

	@Override
	public boolean isOmnivore() {
		return false;
	}

}
