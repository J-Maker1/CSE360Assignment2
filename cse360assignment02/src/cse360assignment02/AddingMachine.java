package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str;
  /*
   * Constructor for AddingMachine that will initialize variables
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    str = "0";
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
	  str += " + " + total;
  }
  /*
   * @param value the integer that will be subtracted from the total variable
   */
  public void subtract (int value) {
	  total -= value;
	  str += " - " + total;
  }
  /*
   * @return should return the order of operations
   */
  public String toString () {
    return str + "\n";
  }
  /*
   * This method should clear the memory
   */
  public void clear() {
	  total = 0;
	  str = "0";
  }
}