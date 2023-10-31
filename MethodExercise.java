package com.codercampus.week2;

import java.util.Scanner;

public class MethodExercise {
		
		Scanner scanner = new Scanner (System.in);
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
	
		Integer getNumber(Integer convertedInput) {
		if (convertedInput >= 50 && convertedInput <= 300) {
			this.convertedInput = convertedInput;
			return convertedInput;			
			} else {
				return null;
			}	
		}		
}
