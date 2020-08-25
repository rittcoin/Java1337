/**
 * @(#)WeightConverter.java
 *
 *a program that converts pounds into kilograms
 *
 * @author Ryan Ritter
 * @version 1.00 2019/10/10
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class WeightConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double poundsLower = 0.0;
        double poundsUpper = 0.0;
        double lowerKilos = poundsLower * 0.454;
        double upperKilos = poundsUpper * 0.454;
        int increment; //in pounds
    
        String pattern = "###0.00";
        DecimalFormat formatPattern =  new DecimalFormat(pattern);
        
        System.out.print("This program will display a range of weights and convert them to kilograms.\nEnter the lower bound weight in pounds (lbs): ");
        poundsLower = input.nextDouble();

        System.out.println("Enter the higher bound weight in pounds (lbs): ");
        poundsUpper = input.nextDouble();

        System.out.println("Enter a weight increment: ");
        increment = input.nextInt();

        String table = "   pounds (lbs)     kilograms (kg)     \n";		// Create the header
        table +="------------------------------------------";		// Add the heading underline
        //table += formatPattern.format(poundsLower) + "\t" + formatPattern.format(poundsUpper);

		for (int i = 0; i <= poundsUpper; i+=increment) {
            double pounds = poundsLower += increment;
            double kilos = pounds * 0.454;
			table += "\n|\t" + formatPattern.format(pounds) + "\t|\t"  + formatPattern.format(kilos) + "\t|";
		}

		System.out.println ( table );



    }
}