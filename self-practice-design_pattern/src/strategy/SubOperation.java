package strategy;

public class SubOperation implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}
	

}
