package observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Viewer {

	List<DoMixi> list = new ArrayList<DoMixi>();
	String notify;

	@Override
	public void add(DoMixi ado) {
		// TODO Auto-generated method stub
		list.add(ado);

	}

	@Override
	public void remove(DoMixi ado) {
		// TODO Auto-generated method stub
		list.remove(ado);

	}

	@Override
	public void notify(String notify) {
		// TODO Auto-generated method stub
		for (DoMixi mixi : list) {
			mixi.notifyForViewer(notify);
		}

	}

	public void setNotify(String newNotify) {

		this.notify = newNotify;
		notify(newNotify);

	}

}
