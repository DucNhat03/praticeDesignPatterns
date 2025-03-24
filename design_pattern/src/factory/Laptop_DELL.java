package factory;

public class Laptop_DELL implements Laptop{
	
	String name = "DELL Inspiron 13";

	@Override
	public String getModel() {
		return name;
	}

}
