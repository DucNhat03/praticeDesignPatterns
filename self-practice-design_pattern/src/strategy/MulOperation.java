package strategy;

public class MulOperation implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		return a * b;
	}
	
	

}
