package observer;

public class Mainn {
	public static void main(String[] args) {

		NotifyNimo nimo = new NotifyNimo();
		NotifyYoutube ytb = new NotifyYoutube();

		Youtube ytbforado = new Youtube();

		ytbforado.add(nimo);
		ytbforado.add(ytb);

		ytbforado.notify("Hi anh em, hom nay tui sui");

	}

}
