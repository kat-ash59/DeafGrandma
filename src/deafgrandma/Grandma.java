package deafgrandma;


import java.util.Random;

public class Grandma
{

	public int randomIndex = 0;
	
	public Random randomNumber = new Random();
	
	public String [] randomGrandmaAnswers = new String[6];
	
	public String thatsWhatSheSaid = randomGrandmaAnswers[5] = "As I was saying ..... Ohhhhhhh Shinnnnnyyyy";
	
	// method to determine what graddma hears
	// it will randomly return uppercase text
	public String grandmaHears(String sheHeard)
	{
		randomIndex = randomNumber.nextInt(2);
		
		String grandmaHeard = null;
		
		if (randomIndex == 1)
		{
			grandmaHeard = sheHeard.toUpperCase();
		}
		else
		{
			grandmaHeard = sheHeard;
		}
		
		return grandmaHeard;
		
		
	} // end method grandmaHears
	
	// returns affirmative strings in random case
	// upper case, lower case or original text
	public String affirmative()
	{
		
		randomIndex = randomNumber.nextInt(6);
		
		String saying = null;
		
		
		randomGrandmaAnswers[0] = "\n\nNo, Not since the war!!!!!\n\n";
		randomGrandmaAnswers[1] = "\n\nI remember when you were this high!\n\n";
		randomGrandmaAnswers[2] = "\n\nCome here let me kiss that cute face!\n\n";
		randomGrandmaAnswers[3] = "\n\nDid I ever tell you I went to school uphill both ways in the snow?!?!\n\n";
		randomGrandmaAnswers[4] = "\n\nYou silly child.  Of course I love your visits!!!!\n\n";
		
		saying = randomizeCase(randomGrandmaAnswers[randomIndex]);
		// System.out.println("\n\nInside affirmative saying = " + saying);
		return saying;
	
	} // end method affirmative
	
	// return negative strings in random case
	// upper case, lower case or original text
	public String negative()
	{
		randomIndex = randomNumber.nextInt(6);

		String saying = null;
		
		randomGrandmaAnswers[0] = "\n\nHUH? SPEAK UP CHILD!!!!\n\n";
		randomGrandmaAnswers[1] = "\n\nThe world is going to hell in a handbasket!!!!\n\n";
		randomGrandmaAnswers[2] = "\n\nWhy in the world did you say that!!!!!\n\n";
		randomGrandmaAnswers[3] = "\n\nYes I am hungry get me some grub!!!!\n\n";
		randomGrandmaAnswers[4] = "\n\nI would never go out in public without my teeth!!!!\n\n";
		
		saying = randomizeCase(randomGrandmaAnswers[randomIndex]);
		// System.out.println("\n\nInside affirmative saying = " + saying);
		return saying;
		// return randomizeCase(randomGrandmaAnswers[randomIndex]);
		
	} // end method negative
	
	// return farewell address in random case
	// upper case, lower case or original text
	public String farewell()
	{
		
		randomIndex = randomNumber.nextInt(5);
		
		String saying = null;
		
		randomGrandmaAnswers[0] = "\n\nC\'YA!!!! Smell you later!!!!!\n\n";
		randomGrandmaAnswers[1] = "\n\nSo long, Farewell, Auf Wiedersehen, Goodbye!!!!!!!!!\n\n";
		randomGrandmaAnswers[2] = "\n\nSee you later alligator!!!!!\n\n";
		randomGrandmaAnswers[3] = "\n\nBye Bye Nite Nite!!!!\n\n";
		randomGrandmaAnswers[4] = "\n\nGet out of here already!!!!\n\n";
		
		saying = randomizeCase(randomGrandmaAnswers[randomIndex]);
		// System.out.println("\n\nInside affirmative saying = " + saying);
		return saying;
		// return randomizeCase(randomGrandmaAnswers[randomIndex]);
		
	} // end method farewell
	
	// method to randomize what case the text will return
	public String randomizeCase(String saying)
	{
		randomIndex = randomNumber.nextInt(5);
		
		// System.out.println("inside randomize case random index = " + randomIndex);
		
		if ((randomIndex % 2) == 0)
		{
			// System.out.println("inside randomize case force upper case = " + saying);
			return saying.toUpperCase();
		}
		else if ((randomIndex % 3) == 0)
		{
			// System.out.println("inside randomize case force lower case = " + saying);
			return saying.toLowerCase();
		}
		else
		{
			// System.out.println("inside randomize case don\'t change  = " + saying);
			return saying;
		}
	} // end method randomize case
	
	
	
	// provides a random answer that grandma will answer with
	public String randomAnswer(String grandmaHeard)
	{
		Grandma getAnAnswer = new Grandma();
		
		randomIndex = randomNumber.nextInt(3);
		
		// System.out.println("inside random answer randomIndex = " + randomIndex);
		
		if (grandmaHeard.equals("GOODBYE"))
		{
			// System.out.println("grandma heard GOODBYE - should exit after this");
			System.out.println(getAnAnswer.farewell());
			return "GOODBYE";
		}
		else	
		{
			if (randomIndex == 1)
			{
				System.out.println(getAnAnswer.affirmative());
				return getAnAnswer.affirmative();
			}
			else if (randomIndex == 2)
			{
				System.out.println(getAnAnswer.negative());
				return getAnAnswer.negative();
			}
			else
			{
				System.out.println(getAnAnswer.farewell());
				return getAnAnswer.farewell();
			}
		}
	
		
	} // end method randomAnswer
	
} // end class Grandma
