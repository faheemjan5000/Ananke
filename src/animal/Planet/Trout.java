package animal.Planet;

public class Trout implements Fish {

	private String type;
	private int weight;
	
	public Trout(String type, int weight) {
		this.type=type;
		this.weight=weight;
	}
	@Override
	public String getName() {
		return "Trout";
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
	public void setType(String type) {
		this.type=type;
	}
	@Override
	public String getType() {
		return this.type;
	}

}
