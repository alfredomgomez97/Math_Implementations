package VariousQuestions;

public class QuadraticEquation {
	private double firstRoot;
	private double secondRoot;
	
	public void findTheRoots(int aValue, int bValue ,int cValue) {
		firstRoot = (double) ((-bValue) + Math.sqrt(Math.pow(bValue, 2) - 4 * aValue * cValue ));
		firstRoot = (double) firstRoot/(2*aValue);
		secondRoot = (double) ((-bValue) - Math.sqrt(Math.pow(bValue, 2) - 4 * aValue * cValue ));
		secondRoot = secondRoot/(2*aValue);
		if(firstRoot == secondRoot) {
			System.out.println("There is one root and it is x = " + firstRoot);
		}else {
			System.out.println("The roots of this equation is x = " +  firstRoot + " x = " + secondRoot);
		}
	}
	public void CheckForImagenaryRoots(int aValue, int bValue ,int cValue) {
		
	}
	public void findTheImagenaryRoots(int aValue, int bValue ,int cValue){
		
	}
	
}
 