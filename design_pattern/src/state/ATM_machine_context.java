package state;

public class ATM_machine_context  {

	ATM_machine atm_machine;

	public ATM_machine_context(ATM_machine atm_machine) {
		this.atm_machine = atm_machine;
	}

	public void request() {
		atm_machine.handleRequest();
	}

	public void setATM_machine(ATM_machine atm_machine) {
		this.atm_machine = atm_machine;
	}

}
