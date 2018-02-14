package ie.dit;

public class Tune implements Player
{
	//private fields
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	
	//getters that the other classes/main can access
	public int getX()
	{
		return x;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAltTitle()
	{
		return altTitle;
	}
	
	public String getNotation()
	{
		return notation;
	}
	
	//toString class
	public String toString()
	{
		String toBeReturned;
		if(altTitle.isEmpty())
		{
			//checks if an alternative title is there if not then only returns
			//the number and title
			toBeReturned = x+", "+title;
		} else {
			//if alternative title is present then it will return
			//number, title and the alternative title
			toBeReturned =  x+","+title+","+altTitle;
		}
		return toBeReturned;
	}
	
	public void play()
	{
		//as the interface method is a void method
		//I have to manually print it out to the console
		//using notation as that is the only thing that is to be printed
		System.out.println(notation);
	}
}