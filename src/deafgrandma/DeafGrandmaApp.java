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
		String grandmaHeard = null;
		boolean keepTalkingToGrandma = true;
		Grandma grandmaAnswers = new Grandma();
		int randomIndex = 0;
		
		
		System.out.println("\n\nPlease say something to Grandma! ");
		System.out.print("When you want to leave say \"GOODBYE\" ");
		talkToGrandma = keyboard.nextLine();
		
		// System.out.println("before while loop talkToGrandma = " + talkToGrandma);
		
		grandmaHeard = grandmaAnswers.grandmaHears(talkToGrandma);
		
		
		while(keepTalkingToGrandma)
		{
		
			if (grandmaHeard.contains("BYE"))
			{
				System.out.println(grandmaAnswers.farewell());
				break;
			}
			else if (grandmaHeard.equals(talkToGrandma.toUpperCase()))
			{
				System.out.println(grandmaAnswers.affirmative());
			}
			else
			{
				System.out.println(grandmaAnswers.negative());
			}
		
			System.out.print("\n\nPlease say something to Grandma! ");
			talkToGrandma = keyboard.nextLine();
			talkToGrandma = grandmaAnswers.randomizeCase(talkToGrandma);
			
			grandmaHeard = grandmaAnswers.grandmaHears(talkToGrandma);
			
		} // end while loop
		
		keyboard.close();
		System.out.println("Leaving Grandma\'s house!");
		
	} // end main

} // end DeafGrandmaApp
