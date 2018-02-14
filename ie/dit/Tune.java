package ie.dit;

public class Tune 
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
	
	public getNotation()
	{
		return notation;
	}
	
	public String toString()
	{
		
		return x+","+title+","+altTitle;
	}
	
}