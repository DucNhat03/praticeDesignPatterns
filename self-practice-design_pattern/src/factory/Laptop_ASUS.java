package factory;

public class Laptop_ASUS implements Laptop{

	String name = "ASUS vivobook 14";
	
	
	@Override
	public String getModel() {
		return name;
	}
	
	

}
