package composite;

public abstract class Phone {

	protected String name;
	protected int price;

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}



	public abstract int totalPhone();

}
