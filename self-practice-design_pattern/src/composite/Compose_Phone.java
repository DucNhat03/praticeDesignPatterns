package composite;

import java.util.ArrayList;

public class Compose_Phone extends Phone implements Interface_Phone {

	ArrayList<Phone> listPhone;

	public Compose_Phone(String name, int price) {
		super(name, price);
		listPhone = new ArrayList<Phone>();
	}
	
	
	public void showList() {
		for (Phone phone:listPhone) {
			System.out.println(phone.name + " | " + phone.price);
			
		}
	}

	@Override
	public int totalPhone() {
		int totalPrice = 0;
		for (Phone phone : listPhone) {
			totalPrice += phone.price;
		}

		return totalPrice;
	}

	@Override
	public void addPhone(Phone phone) {
		listPhone.add(phone);
	}

	@Override
	public void removePhone(Phone phone) {
		listPhone.remove(phone);

	}

}
