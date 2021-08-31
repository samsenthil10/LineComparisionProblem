package com.bridgelabz.linecomparisonproblem;

public class LengthComparatorImpl implements LengthComparatorIF {

	@Override
	public void checkEqualLines(Line line1, Line line2) {
		
		LengthCalculatorIF lengthCalculator =  new LengthCalculatorImpl(); 
		
		Double lengthOfLine1= lengthCalculator.lengthOfLine(line1);
		Double lengthOfLine2= lengthCalculator.lengthOfLine(line2);
		
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Two Lines Are Equal");
			System.out.println("Line 1 Distance: "+lengthOfLine1);
			System.out.println("Line 2 Distance: "+lengthOfLine2);
		}
	}

	@Override
	public void compareLines(Line line1, Line line2) {
		
		LengthCalculatorIF lengthCalculator =  new LengthCalculatorImpl(); 
		Double lengthOfLine1= lengthCalculator.lengthOfLine(line1);
		Double lengthOfLine2= lengthCalculator.lengthOfLine(line2);

		if(lengthOfLine1.compareTo(lengthOfLine2) < 0) {
			System.out.println("Line 1 is shorter than Line 2");
			System.out.println();
			System.out.println("Line 1 Distance: "+lengthOfLine1);
			System.out.println("Line 2 Distance: "+lengthOfLine2);
		}
		else if(lengthOfLine1.compareTo(lengthOfLine2) > 0) {
			System.out.println("Line 1 is longer than Line 2");
			System.out.println();
			System.out.println("Line 1 Distance: "+lengthOfLine1);
			System.out.println("Line 2 Distance: "+lengthOfLine2);
		}

	}
}
