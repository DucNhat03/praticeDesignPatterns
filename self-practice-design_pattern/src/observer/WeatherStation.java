package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	
	List<Observer> list = new ArrayList<Observer>();
	
	private String weather;

	@Override
	public void addObserver(Observer observer) {
		list.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
		
	}

	@Override
	public void notifyy(String weather) {
		for (Observer ob : list) {
			ob.update(weather);
		}
		
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
		notifyy(weather);
	}
	

}
