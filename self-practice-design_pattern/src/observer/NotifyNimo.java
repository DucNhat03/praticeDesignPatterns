package observer;

public class NotifyNimo implements DoMixi {

	String notifyOnNimo;

	@Override
	public void notifyForViewer(String notify) {
		// TODO Auto-generated method stub
		displaynotify(notify);

	}

	public void displaynotify(String notify) {
		System.out.println("Nimo notify: " + notify);
	}

}
