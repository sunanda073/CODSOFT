//NUMBER GAME

import java.util.*;
import java.io.*;

class userInteraction
{
	int random, userNo, c;

	userInteraction()
	{
		//Maximum no of guesses allowed
		c = 10;
		System.out.println("You can guess the number maximum "+c+" times");

		//Creating the object of Random class
		Random randomNumber = new Random(); 
		
		//Generating random  number
		random = randomNumber.nextInt(100);

		//redirecting to input() method
		input();
	}

	//taking input from the user 
	void input()
	{
		do
		{
			try
			{
				DataInputStream ds=new DataInputStream(System.in);
				System.out.println("\nGuess  a number : ");
				userNo = Integer.parseInt(ds.readLine());

				//reducing the no of guesses 
				c--;

				//calling display() method
				display();
			}
			catch(IOException e){}

			//calling the getGuessNo() method
			getGuessNo();

		}while(c>0);
	}

	//displaying the result
	void display()
	{
		if(userNo == random)
		{
			System.out.println("\n*******************************************************");
			System.out.println("Hooray!! Your guess is perfect and the number is "+userNo+" :)");
			System.out.println("You won the game !! and your score is : "+ c);
			System.out.println("*******************************************************");
			System.exit(0);
		}
		else if(userNo < random)
		{
			System.out.println("\nOops! It seems the number is too small:(");
		}
		else
		{
			System.out.println("Oops! It seems the number is too large :(");
		}
	}

	//displaying the no of guesses left
	void getGuessNo()
	{	
		if(c>0)
			System.out.println("Only "+c+" guesses left !");
		else
			System.out.println("Sorry, you have used the no of guesses !! You lost the game !");
	}
		
}	

class numberGame
{
	public static void main(String args[])
	{
		//Creating the object of userInteraction class
		userInteraction obj = new userInteraction();
	}
}