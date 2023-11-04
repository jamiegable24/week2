package com.codercampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		Integer convertedInput = 1;	
		
		MethodExercise input = new MethodExercise();
				
		input.getNumber(convertedInput);
		System.out.println("The number you typed in was: " + convertedInput);
	}
}
