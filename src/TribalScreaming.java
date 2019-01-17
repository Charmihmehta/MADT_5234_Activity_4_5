import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
		
			if(name.length == 2)
			{
				return name[0] + " and " + name[1] + " are amazing";
			}
			
		
			else {
				List<String> regular = new ArrayList<String>();
				String uppercase = null ;
				String names = name[0];
				String[] array = null;
				for(int i = 0; i< name.length ; i++)
				{
				
					if(name[i] == name[i].toUpperCase())
					{
						 uppercase = name[i];
					}
					else
					{
						regular.add(name[i]);  
						
						
					}
					
				}
				 String[] itemsArray = new String[regular.size()];
			        itemsArray = regular.toArray(itemsArray);
			       // for(String s : itemsArray)
			           // System.out.println(s);
			        for(int j = 1 ; j<itemsArray.length ; j++)
					{
						if(j == itemsArray.length-1)
						{
							names += " and " + name[j]  ;
						}
						else
							
						names += ", " + name[j]  ;
					}
			      
			       if(uppercase != null)
				return names + " are amazing. " + uppercase + " ALSO!";
			       else
			    	   return names + " are amazing.";
			    	   
			}
		
		
	}

}
