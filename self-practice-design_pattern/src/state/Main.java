package state;

public class Main {
	public static void main(String[] args) {
		
		ATM_machine_context atm_machine_context;
		ATM_machine atm_machine;
		
		atm_machine_context = new ATM_machine_context(atm_machine = new ReadyState());
		atm_machine_context.request();
		
		
		System.out.println("===== Set state ATM machine is Busy =====");
		atm_machine_context.setATM_machine(atm_machine = new BusyState());
		atm_machine_context.request();
		
		System.out.println("===== Stop ATM machine =====");
		atm_machine_context.setATM_machine(atm_machine = new StopState());
		atm_machine_context.request();
		
	}

}
