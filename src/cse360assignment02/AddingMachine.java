package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;

  public AddingMachine() {
    this.total = 0; // not needed - included for clarity
    this.history = "0";
  }

  public int getTotal() {
	  // returns the current total
    return this.total;
  }

  public void add(int value) {
	  // add value to the total
    this.total = this.total + value;
    this.history = this.history + (" + " + value);
  }

  public void subtract(int value) {
	  // subtract value from the total
    this.total = this.total - value;
    this.history = this.history + (" - " + value);
  }

  public String toString() {
	  // returns a string representing total
    return this.history;
  }

  public void clear() {
	  // resets the total and history
    this.total = 0;
    this.history = "0";
  }

  public static void main(String[] args){
    AddingMachine myCalculator = new AddingMachine();

    myCalculator.add (4); 
    System.out.println(myCalculator.getTotal());
    myCalculator.subtract (2); 
    System.out.println(myCalculator.getTotal());
    myCalculator.add(5);
    System.out.println(myCalculator.getTotal());

    System.out.println(myCalculator);
    
    myCalculator.clear();
    System.out.println(myCalculator);
  }
}
