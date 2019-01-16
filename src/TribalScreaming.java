
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

}
