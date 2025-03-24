package factory;

public class Laptop_MSI implements Laptop{
	
	String name = "MSI modern 15";

	@Override
	public String getModel() {
		return name;
	}

}
