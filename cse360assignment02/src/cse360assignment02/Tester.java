package cse360assignment02;

public class Tester {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.toString();
		myCalculator.clear();
		myCalculator.toString();
		
	}
}
