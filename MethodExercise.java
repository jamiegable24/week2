package com.codercampus.week2;

import java.util.Scanner;

public class MethodExercise {
		
	 String getNumber() {
		Scanner scanner = new Scanner (System.in);
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		scanner.close();
	
		//(Integer convertedInput) {
		if (convertedInput >= 50 && convertedInput <= 300) {
			//this.convertedInput = convertedInput;
			return userInput;		
			} else {		
				
				return null;
			}	
		}		
}
