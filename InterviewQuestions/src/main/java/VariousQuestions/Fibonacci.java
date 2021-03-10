package VariousQuestions;

public class Fibonacci {
	private int previousNumber = 0;
	private int currentNumber = 1;
	private int total = 0;
	private int counter = 2;


	public int FibonacciSeries(int userNumber) {
		
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
}
