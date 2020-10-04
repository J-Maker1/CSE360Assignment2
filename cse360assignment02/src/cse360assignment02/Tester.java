package cse360assignment02;
/*
 * This class is meant only for testing AddingMachine to make sure it works as intended.
 * Please refer to @AddingMAchine for the assignment
 */
public class Tester {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();	//create object out of AddingMachine
		myCalculator.add(4);
		myCalculator.subtract(2);	//Calling the add and subtract functions
		myCalculator.add(5);
		System.out.println(myCalculator.toString());	//Testing toString
		System.out.println(myCalculator.getTotal());	//Testing getTotal
		myCalculator.clear();							//Testing clear
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
	}
}
