package state;

public class StopState implements ATM_machine {

	@Override
	public void handleRequest() {
		System.out.println("ATM machine is stopped.");
	}

}
