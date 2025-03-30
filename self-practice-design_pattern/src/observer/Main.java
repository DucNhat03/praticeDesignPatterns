package observer;


public class Main {
	public static void main(String[] args) {
		
		WeatherStation weatherStation = new WeatherStation();
		
		TVDisplay tv = new TVDisplay();
		
		
		PhoneDisplay phone = new PhoneDisplay();
				
		
		weatherStation.addObserver(phone);
		weatherStation.addObserver(tv);
		
		
		
		weatherStation.notifyy("hello");
		
	}

}
