package factory;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = null;
		LaptopFactory factory = new LaptopFactory();
		
		laptop = factory.getLaptop(Model.MSI);
		System.out.println("Laptop Model: " + laptop.getModel());

		
	}
}
