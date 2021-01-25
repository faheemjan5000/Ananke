package animal.Planet;

public class Mermaid implements Fish, Human {

	private String name;
	private double height;
	private int age;
	private String type;
	private int weight;
	private int morePercentage;
	public Mermaid(String name, double height, int age, String type, int weight,int morePercentage) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.type = type;
		this.weight=weight;
		this.morePercentage=morePercentage;
	}
	@Override
	public String getName() {
		return this.name;
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
	public int getAge() {
		return this.age;
	}
	@Override
	public double getHeight() {
		return this.height;
	}
	@Override
	public void setType(String type) {
		this.type=type;
	}

	public String getType() {
		return this.type;
	}
    public boolean isMoreHuman() {
    	if(this.morePercentage>60)
    		return true;
    	else return false;
    }
}
