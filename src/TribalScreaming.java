
public class TribalScreaming {
	
	public String scream(String name)
	{
		if(name != null && name != name.toUpperCase() )
		{
			return name + " is amazing";
		}
		
		else if(name == "" || name == null)
		{
		return "You are amazing";
		}
		return name;
	}

}
