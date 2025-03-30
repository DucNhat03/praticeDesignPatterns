package observer;

public class TVDisplay implements Observer{
	String weather;
	
	void display(String weather) {
		System.out.println("Display on TV: "+ weather);
	}

	@Override
	public void update(String weather) {
		display(weather);
	}
	
}
