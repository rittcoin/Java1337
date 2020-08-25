// --------------------------------------------
//               HotdogStand.java
//               Ryan Ritter
// --------------------------------------------
public class HotdogStand
{
    private String standId;
    private int dogsSoldToday;
    static int totalDogsSoldEverywhere = 0;
	
	public void justSold(){
        HotdogStand.totalDogsSoldEverywhere++;
        dogsSoldToday ++;
    }
    static int getTotalDogsSoldEverywhere(){
        return totalDogsSoldEverywhere;
    }
    
    //getters and setters for class variables
    public int getDogsSoldToday(){
        return dogsSoldToday;
    }
    public void setDogsSoldToday(int s){
        HotdogStand.totalDogsSoldEverywhere -= dogsSoldToday;
        dogsSoldToday = s;
        HotdogStand.totalDogsSoldEverywhere += dogsSoldToday;

    }
    public String getStandId(){
        return standId;
    }
    public void setStandId(String d){
        standId= d;
    }
	//constructors
    public HotdogStand() 
	{
		this("9999", 100);
    }

    public HotdogStand(String name, int hotdogs) 
	{
        standId = name;
        dogsSoldToday = hotdogs;
        HotdogStand.totalDogsSoldEverywhere += hotdogs;

	}

	public String toString()
	{
		String x = " " + standId + " " + dogsSoldToday;
		return x;
    }
    //copy constructor
    public HotdogStand (HotdogStand r ){
        if (r == null){
            throw new NullPointerException("null argument passed.");
        }
        standId = new String(r.standId);
        dogsSoldToday = r.dogsSoldToday;
        HotdogStand.totalDogsSoldEverywhere += r.dogsSoldToday;
        System.out.println("Copy constructor called:");
    }
		
	public boolean equals(Object obj)
	{
		if ( this == obj ) return true;

		if ( ( obj != null ) && ( getClass( ) == obj.getClass( ) ) )
		{
			HotdogStand d = (HotdogStand) obj;

			if ((standId.toString().equals(d.standId.toString())) &&
			     (dogsSoldToday == d.dogsSoldToday))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public void finalize ( )
	{
		
		System.out.println  ("HotdogStand class - finalize method");
	}
	
}