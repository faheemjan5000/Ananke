package animal.Planet;

public class App {

	public static void main(String[] args) {
		Mermaid mermaid = new Mermaid("rokasha", 5.5, 15, "Lankan", 30, 70);
		
		System.out.println("Name of the mermaid : "+ mermaid.getName());
		System.out.println("age : "+mermaid.getAge());
		System.out.println("Height : " + mermaid.getHeight());
		System.out.println("is this mermaid more human ? " + mermaid.isMoreHuman());
		System.out.println("**********************************");
		
		Animal penguin = new Penguin();
		System.out.println("Name of the Bird is : " + penguin.getName());
		System.out.println("**********************************");
		
		Fish shark = new Shark("Alopias", 150);
		System.out.println("Name of the Fish :" + shark.getName());
		System.out.println("Type of the Fish :" + shark.getType());
		System.out.println("**********************************");
	}

}
