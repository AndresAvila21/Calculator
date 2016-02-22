/**
 * Practice with test driven development and into to git and github
 * @author Andres Avila
 * @version Feb 22, 2016
 */

package cse360assign3;

public class Calculator {

	private int total;
	
	/**Calculator Constructor */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**returns total */
	public int getTotal () {
		return total;
	}
	
	/**adds the value */
	public void add (int value) {
		total += value;
	}
	
	/**subtracts the value */
	public void subtract (int value) {
		total -= value;
	}
	
	/**multiplies the value */
	public void multiply (int value) {
		total *= value;
	}
	
	/**divides the value */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
		total = total/value;
	}
	
	/**returns previous actions */
	public String getHistory () {
		return "";
	}
}
