package state;

public class BusyState implements ATM_machine{
	
	
	@Override
	public void handleRequest() {
		System.out.println("ATM machine is busy.");
	}

}
