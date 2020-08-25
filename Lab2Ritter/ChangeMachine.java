/**
 * @(#)ChangeMachine.java
 *
 *a program that determines correct change to give in the lowest number of coins.
 *
 * @author 
 * @version 1.00 2019/9/27
 */
import javax.swing.JOptionPane;
public class ChangeMachine {

    public static void main(String[] args) {
        //create variables for price change and coins
        int price = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        
        //prompt for input 
		String myString = JOptionPane.showInputDialog("What is the price of your item? Must be between 25 - 100 cents and a multiple of five. ");
		price = Integer.parseInt(myString.trim());
		int startChange = 100 - price;
		//updated change value
		int currentChange = startChange;
        
        //check input
        while (price < 25 || price > 100 || price % 5 != 0){
        	JOptionPane.showMessageDialog(null, "Invalid input try again:");
			String input = JOptionPane.showInputDialog("What is the price of your item? Must be between 25 - 100 cents and a multiple of five.");
			price = Integer.parseInt(input.trim());
        }
        
   
		//else, do logic. 
		
    	//give quarters first
    	while(currentChange >= 25){
    		++quarters;
    		currentChange -= 25;
    		/* uncomment to debug and check maths
    		System.out.printf("Your change is now %d cents\n", currentChange);
    		System.out.printf("quarters++ %d\n", quarters);
    		*/
    		
    	}
    	//then give dimes
    	while(currentChange < 25 && currentChange >= 10){
    		currentChange -= 10;
    		dimes++;
    		/* uncomment to debug and check maths
    		System.out.printf("Your change is now %d cents\n", currentChange);
    		System.out.printf("dimes++ %d\n", dimes);
    		*/
    	}
    	//then nickles
    	while(currentChange < 10 && currentChange >= 5){
    		currentChange -= 5;
    		nickles++;
    		/*uncomment to debug and check maths
    		System.out.printf("Your change is now %d cents\n", currentChange);
    		System.out.printf("nickles++ %d\n", nickles);
    		*/
    	}
    	
    	JOptionPane.showMessageDialog(null, "Your change is " + startChange + " cents. You receive " + quarters + " quarters, "+ dimes + " dimes, and " + nickles + " nickles.");
    	
    }
    
        	
    
}
