// -------------------------------------------------
//                    TestCourse.java
//					  Ryan Ritter
// -------------------------------------------------

public class TestCourse 
{
	public static void main(String [] args)
	{
		Course cs1337 = new Course("CS1337", "A college course that teaches noobs how to code Java", 4, 40);
		System.out.println("Course = " + cs1337);
        Course cs2337 = new Course ();
        System.out.println("Course using default constructor = " + cs2337.getCourse() + "--" + cs2337.getCredits() + "--" + cs2337.getDescription() + "--" + cs2337.getMaxStudents());
        System.out.println();
        cs2337.setCourse("CS 2337");
        cs2337.setCredits(3);
        cs2337.setDescription("An intermediate college course that teaches amatuer coders more Java skills.");
        cs2337.setMaxStudents(30);

        System.out.println("Test getters and setters: \n" + cs2337.getCourse() + "--" + cs2337.getCredits() + "--" + cs2337.getDescription() + "--" + cs2337.getMaxStudents());
        //now testing toString
        System.out.println("toString test: " + cs2337);
        System.out.println("toString test: " + cs1337);

        //testing equals method
        System.out.println("Does 1337 equal 2337? " + cs1337.equals(cs2337));
        System.out.println("Does 1337 equal itself? " + cs1337.equals(cs1337));
        
        System.out.println("Does 2337 equal 1337? " + cs2337.equals(cs2337));
        System.out.println("Does 2337 equal itself? " + cs2337.equals(cs1337));

        //finalize
        cs1337.finalize();
        cs2337.finalize();

        cs1337.dispose();
        cs2337.dispose();



	
	}    
}