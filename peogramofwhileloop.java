package whileloop;

public class peogramofwhileloop {
	
	public static void main(String args[]) {
		StringBuffer string = new StringBuffer();
		char c;
		System.out.println("Enter a string");
		
		try
		{
			while((c=(char)System.in.read())!='\n')
			{
				string.append(c); //Append character
			}
		}
		catch (Exception e) 
	
		{
	        System.out.println("Error in Input");
	        
		}
		
		System.out.println("You have entered.......");
		System.out.println(string);
	}

}
