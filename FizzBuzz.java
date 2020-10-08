/*

The following program is the FizzBuzz challenge in Java.
Challenge:
-Write a program that prints the number from 1 to 100. For multiples of three print "Fizz"
instead of the number and for the multiples of five print "Buzz". For numbers which are
multiples of both three and five print "FizzBuzz".

Project by:
Manuel Sudermann

*/

public class FizzBuzz
{
	public static void main(String[] args)
	{
		//declare strings for easy use throughout the code
		String fizz = "Fizz";
		String buzz = "Buzz";

		//for loop iterating from 1 to 100
		for(int i = 1; i <= 100; i++)
		{
			/*
			If a number is a multiple of 3 and 5, it will be a multiple of 3*5.
			This was done to avoid comparing the current number to 3 and 5 multiple times.
			*/
			if((i % 15) == 0)
			{
				System.out.println(fizz + buzz); //print "FizzBuzz"
			}

			//check if current number is a multiple of 3
			else if((i % 3) == 0)
			{
				System.out.println(fizz); //print "Fizz"
			}

			//check if current number is a multiple of 5
			else if((i % 5) == 0)
			{
				System.out.println(buzz); //print "Buzz"
			}

			//if the current number is neither a multiple of 3 or 5
			else
			{
				System.out.println(i); //print the current number
			}
		}
	}
}