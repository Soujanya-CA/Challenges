package com.technoelevate.Challenges;

public class Challenge3 {

	public static void main(String[] args) {
		
		printEqual(-1, -2, -3);
		printEqual(2,2,2);
		printEqual(2,3,4);
		printEqual(3,3,4);
	}

public static void printEqual(int firstParameter, int secondParameter, int thirdParameter) {
    if ((firstParameter < 0) || (secondParameter < 0) || (thirdParameter < 0)) {
        System.out.println("Invalid Value");
    } else if ((firstParameter == secondParameter) && (secondParameter == thirdParameter)) {
        System.out.println("All numbers are equal");
    } else if (!(firstParameter == secondParameter) && !(secondParameter == thirdParameter) && !(thirdParameter == firstParameter)) {
        System.out.println("All numbers are different");
    } else {
        System.out.println("Neither all are equal or different");
    }
}
}


/*Write a method printEqual with 3 parameters of type int. The method should not return anything ( void). 
		 If one of the parameters is less than 0, print text "Invalid Value". 
		 If all numbers are equal print text "All numbers are equal" 
		 If all numbers are equal print text "All numbers are equal" 
		 If all numbers are different print text "All numbers are different". 
		 Otherwise, print "Neither all are equal or different". */