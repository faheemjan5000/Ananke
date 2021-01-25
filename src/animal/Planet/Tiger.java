package animal.Planet;

public class Tiger implements Mammals {

	private String tigerName;
	private String tigerType;
	private int weight;
	
	public Tiger(String tigerName, String tigerType,int weight) {
		super();
		this.tigerName = tigerName;
		this.tigerType = tigerType;
		this.weight=weight;
	}
	@Override
	public String getName() {
		
		return this.tigerName;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public boolean isHousePet() {
		return false;
	}

	@Override
	public boolean isCarnivore() {
		return true;
	}

	@Override
	public boolean isHerbivore() {
		return false;
	}

	@Override
	public boolean isOmnivore() {
		return false;
	}
	public String getType() {
		return this.tigerType;
	}

}
