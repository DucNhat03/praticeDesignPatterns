package observer;

public class PhoneDisplay implements Observer {
	String weather;

	void display(String weather) {
		System.out.println(" Display on Phone: " + weather);
	}

	@Override
	public void update(String weather) {
		display(weather);

	}

}
