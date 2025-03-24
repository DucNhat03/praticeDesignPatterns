package factory;

public class LaptopFactory {

	public Laptop getLaptop(Model model) {
		switch (model) {
		case MSI:
			return new Laptop_MSI();
		case DELL:
			return new Laptop_DELL();
		case ASUS:
			return new Laptop_ASUS();
		default:
			return null;
		}
	}

}
