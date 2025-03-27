package composite;

public class Leaf_Phone extends Phone{

	public Leaf_Phone(String name, int price) {
		super(name, price);
	}

	@Override
	public int totalPhone() {
		return price;
	}

}
