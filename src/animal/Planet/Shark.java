package animal.Planet;

public class Shark implements Fish {

	private String type;
	private int weight;
	
	public Shark(String type,int weight) {
		this.type=type;
		this.weight=weight;
	}
	boolean isDangerous() {
		return true;
	}
	@Override
	public String getName() {
		return "Shark";
	}
    public void setWeight(int weight) {
    	this.weight=weight;
    }
	@Override
	public int getWeight() {
		return this.weight;
	}
    public void setWeightInKg(int weight) {
    	this.weight=weight;
    }
	@Override
	public boolean isHousePet() {
		return false;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(String type) {
		this.type=type;
		
	}

}
