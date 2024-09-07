package deafgrandma;

/*
 
 Application Overview
 
You are going to see your sweet old Grandma. Unfortunately, she can't hear very well (she would never admit it, but she's stone cold deaf). This application will describe your conversations with Grandma.

User Story #1
The user is prompted to say something to Grandma.

*/

import java.util.Scanner;

public class DeafGrandmaApp 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String talkToGrandma = null;
		
		// user Story #1
		System.out.print("\n\nPlease say something to Grandma! ");
		talkToGrandma = keyboard.nextLine();
		
		System.out.println("What you said to Grandma = " + talkToGrandma);
		
		keyboard.close();
		
	} // end main

} // end DeafGrandmaApp
