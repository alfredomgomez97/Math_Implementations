package VariousQuestions;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu();
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Please enter the number you want the fibonacci sequence to end at: ");
			
			int userNumber = sc.nextInt();
			int total = Fibonacci(userNumber);
			System.out.println("The Fibonacci number is:" + total);
			
		}else if( choice == 2) {
		
		//FizzBuzzChallance
		System.out.println("Please enter the number for the FizzBuzz program");
		int userInput = sc.nextInt();
		int counter = 0;
		while(counter<userInput) {
			if(counter%5 == 0 && counter%3==0) {
				System.out.println("FizzBuzz");
			}else if(counter % 5 ==0)  {
				System.out.println("Fizz");
			}else if(counter % 3 == 0 ) {
				System.out.println("Buzz");
			}else {
				System.out.println(counter);
			}
			counter++;
		}
		}else if (choice ==3) {
		//find the roots
		Scanner scanner = new Scanner(System.in);
		String userOption;
		int aValue;
		int bValue;
		int cValue;
		do {
		System.out.println("Please enter the values to fill in Ax^2 + Bx +C");
		System.out.println("Enter the value for A:");
		aValue = sc.nextInt();
		System.out.println("Enter the value for B:");
		bValue = sc.nextInt();
		System.out.println("Enter the value for C:");
		cValue = sc.nextInt();
		System.out.println("Is this correct:" + aValue + "x^2 + "+ bValue +"x +" + cValue + " :n/N" );
		userOption = scanner.nextLine();
		
		}while(userOption.equals("N")); {
		System.out.println("the first root of this equation");
		int firstRoot;
		int secondRoot;
		firstRoot = (int) ((-bValue) + Math.sqrt(Math.pow(bValue, 2) - 4 * aValue * cValue ));
		firstRoot = firstRoot/(2*aValue);
		secondRoot = (int) ((-bValue) + Math.sqrt(Math.pow(bValue, 2) - 4 * aValue * cValue ));
		secondRoot = secondRoot/(2*aValue);
		if(firstRoot == secondRoot) {
			System.out.println("There is one root and it is x = " + firstRoot);
		}else {
			System.out.println("The roots of this equation is x = " +  firstRoot + " x = " + secondRoot);
		}
		
		}
			
		}
	}
	static int Fibonacci(int userNumber) {
		int previousNumber = 0;
		int currentNumber = 1;
		int total = 0;
		int counter = 2;
		if(userNumber==0) {
			return total;
		}else {
		while(counter<userNumber) {
			total = currentNumber + previousNumber;
			previousNumber = currentNumber;
			currentNumber = total;
			counter++;
		}
		
		}
		return total;
	}
	public static void Menu() {
		System.out.println("1. fibonacci");
		System.out.println("2. fizzbuzz");
		System.out.println("3. quadratic solver");
		System.out.println("What is you option: ");
	}

}
