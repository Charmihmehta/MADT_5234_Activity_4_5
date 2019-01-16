
public class TribalScreaming {
	
	public String scream(String name)
	{
		if(name == null) {
			return "You are amazing";
		}
		else {
			if(name == name.toUpperCase()) {
				return name + " IS AMAZING";
			}
			else {
				return name + " is amazing";
			}
		}

		
	}
	
	public String scream_name(String[] name)
	{
		for(int i = 0; i <= name.length; i++)
		{
			if(name.length == 2)
			{
				return name[0] + " and " + name[1] + "are amazing";
			}
			
		}
		return "";
	}

}
