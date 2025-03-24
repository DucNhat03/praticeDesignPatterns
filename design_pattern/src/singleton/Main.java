package singleton;

public class Main {
	
	public static void main(String[] args) {
		ConnectDB db1 = ConnectDB.getInstance();
		ConnectDB db2 = ConnectDB.getInstance();

		System.out.println("Instace has createed: " + db1);
		System.out.println("Instace has createed: " + db2);
	}

}
