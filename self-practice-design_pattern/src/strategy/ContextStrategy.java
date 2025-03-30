package strategy;

public class ContextStrategy {
	
	Strategy strategy;
	
	public ContextStrategy( Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	int doOperator(int a, int b) {
		return strategy.doOperation(a, b);
	}

}
