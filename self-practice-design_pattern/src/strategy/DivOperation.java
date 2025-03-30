package strategy;

public class DivOperation implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		return a / b;
	}
	
	

}
