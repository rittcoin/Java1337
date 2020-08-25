/**
 * @(#)test.java
 *
 * test application that replaces the word "love" with the word "hate" in a specific sentence.
 *
 * @author Ryan Ritter
 * @version 1.00 2019/8/28
 */

public class Test {

    public static void main(String[] args) {


    	System.out.println("the line of text to be changed:\n");

    	//set a string variable to  be your sentence
    	String sentence = "I love using IDEs\n";

    	//print original string
    	System.out.println(sentence);


		System.out.println("The line of text will be changed to:\n");

		//change the text with replace method of String class and assign that value to a new string
    	String replacedSentence = sentence.replace("love", "hate");

		//print new string
    	System.out.println(replacedSentence);



    }
}
