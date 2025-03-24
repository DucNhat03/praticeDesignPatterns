package state;

public class ReadyState implements ATM_machine {

	@Override
	public void handleRequest() {
		System.out.println("ATM machine is ready.");
	}

}
