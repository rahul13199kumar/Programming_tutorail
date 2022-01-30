package manipulatingString;

public class manipulatingOfString {
	
	public static void main(String args[]) {
		
		StringBuffer str = new StringBuffer("Welcome to Java Programing Language"); //Using String Buffer
		
		System.out.println("Original String :"+ str);  // Obtain string length
		
		System.out.println("Lenght of String :"+ str.length()); //Str.length use for counting length of the word
		
		
		//Accessing Character in a string
		
		for (int i=0; i<str.length(); i++)
		{
			int q = i+1;
			
			//Increasing the value of q by 1 after every loop completed 
			
			System.out.println("Character @ postion : "+ " " + q  + " is  " +str.charAt(i));
			// Inserting a string in the middle 
			  
			
		}
		
		// Inserting a string in the middle 
		  
		String aString = new String(str.toString());
		
		int pos = aString.indexOf("Language");
		
		str.insert(pos," Oriented ");
		
		System.out.println("Modified String :" + str);
		
		//Modifying characters
		
		str.setCharAt(36,'-');
		System.out.println("String now : " + str);
		
		//Appending a string @ the end
		
		str.append("improves Security");
		System.out.println(" Appended String : " + str);
		
		
	}

}
