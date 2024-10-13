package java20240722;

public class CalculatorAbstractExtends extends CalculatorAbstract{
	public CalculatorAbstractExtends(int first, int second) {
		super(first, second);
	}
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
	
	@Override
	public int div() {
		if (second == 0) {
			return 0;
		}
		return first / second;
	}

}
