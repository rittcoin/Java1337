import javax.swing.JOptionPane;

/**
 * @(#)CelToFare.java
 *a simple program that converts Celsius to Fahrenheit
 *
 * @author 
 * @version 1.00 2019/9/26
 */
 
import javax.swing.JOptionPane;
public class CelToFare {
     
    public static void main(String[] args){
		String input = JOptionPane.showInputDialog("Enter a celsius value to get a fahrenheit value in return: ");
		double celsiusTemp = Double.parseDouble(input.trim());
		double fahrenTemp = (celsiusTemp * 9/5) + 32;
	
		JOptionPane.showMessageDialog(null, celsiusTemp + " degrees celsius is equal to " + fahrenTemp + " degrees fahrenheit");

    }
}
