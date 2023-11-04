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
					
					int i = 0;
					while (convertedInput < 50 || convertedInput > 300) {
						System.out.println("Oops, that number wasn't between "
								+ "50 and 300, try again: ");
						i = i +1;
					}
					System.out.println("Done");
				
				return convertedInput;
			}	
		}		
}
