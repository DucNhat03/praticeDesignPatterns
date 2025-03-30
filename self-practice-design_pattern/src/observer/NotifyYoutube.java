package observer;

public class NotifyYoutube implements DoMixi{
	
	String notify;

	@Override
	public void notifyForViewer(String notify) {
		// TODO Auto-generated method stub
		notifyView(notify);
	}
	
	void notifyView(String noti) {
		System.out.println("Youtube notify: "+ noti);
	}
	
	

}
