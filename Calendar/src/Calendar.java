// how to create calendar java program
// created by : saritha
// co signed by : Harsh

import java.util.Scanner;

public class Calendar {
	
	String monthName;
	int monthNumber;
	
	
	public static void main(String args[]){
		
		Calendar c = new Calendar();
		c.printallmonths();
		//c.monthInput(); 
		//c.monthName();
		//System.out.println(c.monthName);
		
		
	}
	
	public void printallmonths(){
		for(monthNumber=1;monthNumber<=12;monthNumber++){
			monthName();
		
		System.out.println(monthName);
		
		
			}
		
	}
         public void monthInput(){
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a month Number:");
		monthNumber= scan.nextInt();
		scan.close();
		
	}
	
	public void monthName(){
		
		if(monthNumber==1)
		{
			monthName = "January";
		}
		else if(monthNumber==2)
		{
			monthName ="February";
		}
		
		else if(monthNumber==3)
		{
			monthName ="March";
		}
		else if(monthNumber==4)
		{
			monthName ="April";
		}
	
	   else if(monthNumber==5)
	
		{
		   monthName ="may";
	    
		}
	
	   else if(monthNumber==6)
		{
			monthName ="June";
		}
	
	   else if(monthNumber==7)
		{
			monthName ="July";
		}
	
	   else if(monthNumber==8)
		{
			monthName ="August";
		}
	
	   else if(monthNumber==9)
		{
			monthName ="September";
		}
    	
			
	   else if(monthNumber==10)
		{
			monthName ="October";
		}	
	
	   else if(monthNumber==11)
		{
			monthName ="November";
		}
	
	   else if(monthNumber==12)
		{
			monthName ="December";
		}
		
	   else
		   System.out.println(" monthnumber is not between 1 and 12");
	
	
	
	
	
	
	
		
		
	}
	
		
		
		
		
		
		
	

	
	
}
