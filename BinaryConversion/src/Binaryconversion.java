

import java.util.Scanner;
// first java test
public class Binaryconversion 
{
	private static Scanner kbd=new Scanner (System.in);
	public static void main(String[]args)
	{
		
		int numvalue=0;
		System.out.println("please enter an integer between 255 and 0");
		
		numvalue=kbd.nextInt();
		
		if(numvalue>255 || numvalue<0)
			
		{ System.out.println("Error: Integer is too high or too low)");
		
		}
		
		getBinary(numvalue);
	}
	public static void getBinary(int numvalue)
		{
			String s=""; 
			for(int j=0; j<8; j++)
			{
				if(numvalue % 2==1)
				{	
				 s= '1' +s;
				}
				if (numvalue %2==0)
				{
					s='0' + s;
				}
				numvalue=numvalue/2;	
				System.out.println("Binary equivalent is:" +s);
			}
			System.out.println("Binary equivalent is:" +s);
				
				
					
			
			}			
		

		}      
		
	
		// first java project	
			
		
		
			
		
			
		
			
	
	
	

	
	
	
	

