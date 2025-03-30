package strategy;

public class Main {
	public static void main(String[] args) {
		ContextStrategy conStrategy = new ContextStrategy(new AddOperation());

		int resultAdd = conStrategy.doOperator(2, 10);
		System.out.println("> Result Add: " + resultAdd);
		
		conStrategy = new ContextStrategy(new MulOperation());
		
		int resultMul = conStrategy.doOperator(2,  10);
		System.out.println("> > Result Mul: " + resultMul);
		
		
		conStrategy = new ContextStrategy(new SubOperation());
		
		int resultSub = conStrategy.doOperator(2,  10);
		
		System.out.println("> > > Result Sub: " + resultSub);
		
		
		conStrategy = new ContextStrategy(new DivOperation());
		
		int resultDiv = conStrategy.doOperator(10,  2);
		
		System.out.println("> > > > Result Div: " + resultDiv);
		
		
		
		
		
	}
}
