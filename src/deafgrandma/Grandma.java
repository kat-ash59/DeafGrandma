package deafgrandma;


import java.util.Random;

public class Grandma
{

	public int randomIndex = 0;
	
	public Random randomNumber = new Random();
	
	
	
	public String affirmative()
	{
		
		randomIndex = randomNumber.nextInt(5);
		
		String [] affirmativeRandomGrandmaAnswers = new String[5];
		
		affirmativeRandomGrandmaAnswers[0] = "\n\nNO, NOT SINCE THE WAR!!!!!\n\n";
		affirmativeRandomGrandmaAnswers[1] = "\n\nI REMEMBER WHEN YOU WERE THIS HIGH\n\n";
		affirmativeRandomGrandmaAnswers[2] = "\n\nCOME HERE AND LET ME KISS THAT CUTE FACE\n\n";
		affirmativeRandomGrandmaAnswers[3] = "\n\nDID I EVER TELL YOU ABOUT HOW I WALKED TO SCHOOL UPHILL BOTH WAYS?!?!\n\n";
		affirmativeRandomGrandmaAnswers[4] = "\n\nYOU SILLY CHILD. OF COURSE I LOVE YOUR VISITS!!!!\n\n";
		
		return affirmativeRandomGrandmaAnswers[randomIndex];
	
	} // end method affirmative
	
	public String negative()
	{
		randomIndex = randomNumber.nextInt(5);

		String [] negativeRandomGrandmaAnswers = new String[5];
		
		negativeRandomGrandmaAnswers[0] = "\n\nHUH? SPEAK UP CHILD!!!!\n\n";
		negativeRandomGrandmaAnswers[1] = "\n\nTHE WORLD IS GOING TO HELL IN A HANDBASKET!!!!\n\n";
		negativeRandomGrandmaAnswers[2] = "\n\nWHY IN THE WORLD DID YOU SAY THAT!!!!!\n\n";
		negativeRandomGrandmaAnswers[3] = "\n\nYES I AM HUNGRY GO GET ME SOME GRUB!!!!\n\n";
		negativeRandomGrandmaAnswers[4] = "\n\nI WOULD NEVER SAY THAT IN PUBLIC!!!!\n\n";
		
		return negativeRandomGrandmaAnswers[randomIndex];
		
	} // end method negative
	
	public String farewell()
	{
		
		randomIndex = randomNumber.nextInt(5);
		
		String [] farewellAnswers = new String[5];
		
		farewellAnswers[0] = "\n\nSMELL YOU LATER!!!!!\n\n";
		farewellAnswers[1] = "\n\nSO LONG, FAREWELL, AUF WIEDERSEHEN, GOODBYE!!!!!!!!!\n\n";
		farewellAnswers[2] = "\n\nSEE YOU LATER ALLIGATOR!!!!!\n\n";
		farewellAnswers[3] = "\n\nBYE BYE NITE NITE!!!!\n\n";
		farewellAnswers[4] = "\n\nGET OUT OF HERE ALREADY!!!!\n\n";
		
		return farewellAnswers[randomIndex];
		
	} // end method farewell
	
} // end class Grandma
