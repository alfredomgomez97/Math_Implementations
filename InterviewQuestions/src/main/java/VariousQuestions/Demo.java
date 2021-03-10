package VariousQuestions;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();
		QuadraticEquation quadratic = new QuadraticEquation();
		Menu();
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Please enter the number you want the fibonacci sequence to end at: ");
			int userNumber = sc.nextInt();
			int total = fibonacci.FibonacciSeries(userNumber);
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
			Scanner scanner = new Scanner(System.in);
			userOption = scanner.nextLine();
		}while(userOption.equals("N")); {
			quadratic.findTheRoots(aValue, bValue, cValue);
		}
			
		}
	}
	
	public static void Menu() {
		System.out.println("1. fibonacci");
		System.out.println("2. fizzbuzz");
		System.out.println("3. quadratic solver");
		System.out.println("What is you option: ");
	}

}
