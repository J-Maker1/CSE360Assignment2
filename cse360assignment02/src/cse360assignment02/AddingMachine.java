package cse360assignment02;

public class AddingMachine {
  private int total;
  /*
   * AddingMachine will define all the functions for manipulating a value
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /*
   * @return should return the current total 
   */
  public int getTotal () {
    return total;
  }
  /*
   * @param value the integer that will be added to the total variable
   */
  public void add (int value) {
	  total += value;
  }
  /*
   * @param value the integer that will be subtracted from the total variable
   */
  public void subtract (int value) {
	  total -= value;
  }
  /*
   * @return should return the order of operations
   */
  public String toString () {
    return "";
  }
  /*
   * This method should clear the memory
   */
  public void clear() {
  }
}