// -------------------------------------------------
//                    TestHotdogStand.java
//					  Ryan Ritter
// -------------------------------------------------

public class TestHotdogStand{
    public static void main(String[] args) {
        //create HotdogStand objects
        HotdogStand joe = new HotdogStand();
        HotdogStand ryan = new HotdogStand("1111", 11);
        System.out.println("HotdogStand using default constructor: store ID = " + joe.getStandId() + " -- Today's dogs sold = " + joe.getDogsSoldToday());
        System.out.println();
        System.out.println("HotdogStand using overloaded constructor: store ID = " + ryan.getStandId() + " -- Today's dogs sold = " + ryan.getDogsSoldToday());
        System.out.println();

        //use setters to overwrite default values
        System.out.println("Testing joe's stand with getters and setters: ");
        joe.setStandId("2222");
        joe.setDogsSoldToday(10);
        System.out.println("store ID =" + joe.getStandId() + " -- Today's dogs sold = " + joe.getDogsSoldToday());
        System.out.println("Total for all stores currently: " + HotdogStand.getTotalDogsSoldEverywhere());
        
        System.out.println();

        //toString test
        System.out.println("toString 2222 [default constructor]:" + joe.toString());
        System.out.println("toString 1111[overloaded constructor]:" + ryan.toString());
        System.out.println();

        //copy constructor test
        System.out.println("Sara decides to copy Ryan's (2222) Hotdog Stand. Let's see if she copied it correctly...");
        HotdogStand sara = new HotdogStand(ryan);
        System.out.println();
        sara.setStandId("99999");
        //testing copy constructor and toString method on copy
        System.out.println("near identical using copy constructor:" + sara.toString());
        System.out.println();

        //equals test
        System.out.println("Does sara(99999) equal ryan(2222)? " + sara.equals(ryan));
        System.out.println("Does ryan(2222) equal itself? " + ryan.equals(ryan));
        System.out.println("Does joe(1111) equal ryan(2222)? "+ joe.equals(ryan));
        System.out.println("Does sara(99999) equal ryan(2222)? "+ sara.equals(joe));
        System.out.println("Does sara(99999) equal itself? " + sara.equals(sara));
        System.out.println("Does joe(1111) equal itself? " + joe.equals(joe));

        System.out.println();
        
        //testing justSold() method and getTotalDogsEverywhere static method
        
        System.out.println("Current sales by stand: Store 1111:  | " + joe.getDogsSoldToday() +  " Store 2222:  | " + ryan.getDogsSoldToday() + " Store 99999: " + sara.getDogsSoldToday());
        System.out.println("Total for all stores currently: " + HotdogStand.getTotalDogsSoldEverywhere());

        System.out.println("Time to open up shop!");
        for(int i=0; i<=10; i++){
            joe.justSold();
            System.out.println("Joe(store 1111) has now sold " + joe.getDogsSoldToday() + " dogs.");
            System.out.println("Every stand has sold " + HotdogStand.getTotalDogsSoldEverywhere() + " dogs.\n");
        }
        for(int i=0; i<=5; i++){
            ryan.justSold();
            System.out.println("Ryan(store 2222) has now sold " + ryan.getDogsSoldToday() + " dogs.");
            System.out.println("Every stand has sold " + HotdogStand.getTotalDogsSoldEverywhere() + " dogs.\n");
        }
        for(int i=0; i<=9; i++){
            sara.justSold();
            System.out.println("Sara(store 99999) has now sold " + sara.getDogsSoldToday() + " dogs.");
            System.out.println("Every stand has sold " + HotdogStand.getTotalDogsSoldEverywhere() + " dogs.\n");
        }
        //finalize
        ryan.finalize();
        joe.finalize();
        sara.finalize();   
    }
}