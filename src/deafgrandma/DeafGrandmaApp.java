package deafgrandma;

/*
 
 Application Overview
 
You are going to see your sweet old Grandma. 
Unfortunately, she can't hear very well (she would never admit it, but she's stone cold deaf).
This application will describe your conversations with Grandma.

See Readme for more information on what we are doing here and steps taken to do it

@author Kat Ash
@version 0.9

*/

import java.util.Scanner;

public class DeafGrandmaApp 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String talkToGrandma = null;
		boolean keepTalkingToGrandma = true;
		Grandma grandmaAnswers = new Grandma();
		
		
		System.out.print("\n\nPlease say something to Grandma! ");
		talkToGrandma = keyboard.nextLine();
		
		
		while(keepTalkingToGrandma)
		{
		
			if (talkToGrandma.toUpperCase().contains("GOODBYE"))
			{
				System.out.println(grandmaAnswers.farewell());
				break;
			}
			else if (talkToGrandma.equals(talkToGrandma.toUpperCase()))
			{
				System.out.println(grandmaAnswers.affirmative());
			}
			else
			{
				System.out.println(grandmaAnswers.negative());
			}
		
			System.out.print("\n\nPlease say something to Grandma! ");
			talkToGrandma = keyboard.nextLine();
		}
		
		keyboard.close();
		System.out.println("Leaving Grandma\'s house!");
		
	} // end main

} // end DeafGrandmaApp
