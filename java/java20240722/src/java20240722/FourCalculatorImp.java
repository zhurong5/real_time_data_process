package java20240722;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FourCalculatorImp implements CalculatorImp{

	int first;
	int second;
	
	@Override
	public int add() {
		return first + second;
	}

	@Override
	public int sub() {
		return first - second;
	}

	@Override
	public void print() {
		System.out.println(first * second);
	}
}