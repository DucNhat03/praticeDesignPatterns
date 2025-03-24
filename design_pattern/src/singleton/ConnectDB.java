package singleton;

public class ConnectDB {

	private static ConnectDB instance = null;

	private ConnectDB() {
	}

	public static ConnectDB getInstance() {
		if (instance == null) {
			instance = new ConnectDB();
		}
		return instance;
	}
	

}
