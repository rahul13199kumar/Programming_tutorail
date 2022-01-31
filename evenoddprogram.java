package evendodd;

import java.util.Scanner;

public class evenoddprogram
{

	public static void main(String args[])
	{
		
		int n ;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your number to check even : " );
		
		n = s.nextInt(); 
		
		if(n % 2==0) 
		{
			
        System.out.println("Congrat your number is even :"+ n);
	}
		else
		{
			System.out.println("Number is odd ");
		}
    }
}
