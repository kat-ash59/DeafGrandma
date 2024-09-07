# DeafGrandma App

### Description
Directly from the homework source....
## Deaf Grandma

### Application Overview

You are going to see your sweet old Grandma. Unfortunately, she can't hear very well (she would never admit it, but she's stone cold deaf). This application will describe your conversations with Grandma.

#### User Story #1

The user is prompted to say something to Grandma.
done!

#### User Story #2

Grandma can only hear the user if the user SHOUTS (responds in capital letters).

had to force userinput from keyboard to use .toUpperCase() when reading from keyboard input

#### User Story #3

When Grandma doesn't hear you, she SHOUTS a phrase such as "HUH? SPEAK UP BILLY!"

added check to see if the input string was all upper case and printed out  "HUH? SPEAK UP BILLY!" if it wasn't

#### User Story #4

When Grandma does hear you, she SHOUTS something like "NO, NOT SINCE THE WAR".

#### User Story #5

Grandma will continue to have a conversation with you until you shout GOODBYE.

#### User Story #6

When you shout GOODBYE at Grandma, she SHOUTS back something like "SMELL YOU LATER!"

#### User Story #7
Expand Grandma's vocabulary of phrases. Grandma should choose from a _different collection_ of phrases for her affirmative (hears you), negative (doesn't hear you), and farewell phrases.

Refactor your code so that Grandma randomly selects an appropriate response. Each collection of phrases should contain at least five things Grandma could say.

### Design Notes
Grandma will be an  _object_ in your program. This means there will a _separate class_ for Grandma.

Grandma will decide if she hears you, and choose an appropriate response based on whether she does. Similarly, if you yell goodbye, she chooses how she responds. (This means _your main method does not contain the code for whether Grandma hears you_. Instead, Grandma's methods determine this.)

The program continues running until the user shouts Goodbye (so grandma hears), at which point after the program allows Grandma to respond, notifies the user that the conversation has ended.

### Stretch goals
* Can you choose Grandma's random response in a separate method? What about a _single_ method that can randomly choose an affirmative (heard ya), negative (not heard), or farewell (c'ya) response (i.e. a random response from any array)?

Graded projects will be pushed to a _public_ GitHub repository for grading. Your instructor will assist in setting up the GitHub repository (_repo_) during class.
* The repo for this project will be named **GrandMaApp**.  
* You are to have your project completed and _pushed to Git_ by start of the next class or as determined by the instructor. 
* You must include a `README.md` describing the program and how the user interacts with Grandma. 

_Never ever (nope, not even then)_ create or edit files directly in your GitHub repo.

If the code:
*  meets all stated requirements by the due date, you will receive 1 point.
*  meets most of the stated requirements by the due date, you may receive .5 point.
*  does not meet the stated requirements by the due date, you may receive 0 points.

If the project receives 0 points, resubmission for potential partial credit may, at the discretion of the instructor, be granted. 

Ignored assignments are given 0 points with no possibility for resubmission.

All code must be created within Eclipse (STS). Projects created using a different IDE will not be accepted.


### Technologies Used
arrays

objects

data types

loops (for, do)

IfElse

.toUpperCase()



### Lessons Learned

# DeafGrandma
