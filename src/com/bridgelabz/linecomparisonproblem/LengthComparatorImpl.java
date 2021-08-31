package com.bridgelabz.linecomparisonproblem;

public class LineComparisonImpl implements LineComparisonIF {

	@Override
	public Double lengthOfLine(Point startPoint, Point endPoint) {
		Double length = Double.valueOf(Math.sqrt(Math.pow((startPoint.xCoordinate-endPoint.xCoordinate),2)+Math.pow((startPoint.yCoordinate-endPoint.yCoordinate),2)));
		return length;
	}

	@Override
	public void checkEqualLines(Double lengthOfLine1, Double lengthOfLine2) {
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Two Lines Are Equal");
			System.out.println("Line 1 Distance: "+lengthOfLine1);
			System.out.println("Line 2 Distance: "+lengthOfLine2);
		}
	}

	@Override
	public void compareLines(Double lengthOfLine1, Double lengthOfLine2) {

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