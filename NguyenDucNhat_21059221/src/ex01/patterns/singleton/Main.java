package ex01.patterns.singleton;

public class Main {
	public static void main(String[] args) {
		/*Singleton Pattern được sử dụng để đảm bảo rằng một lớp chỉ có một instance duy nhất và cung cấp một cách truy cập toàn cục đến instance đó.*/
		// Signleton pattern
		System.out.println("---------- Singleton pattern ----------");
		Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        if (single1.equals(single2)) {
            System.out.println("Unique Instance");
        }
		
	}

}
