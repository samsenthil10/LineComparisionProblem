package com.bridgelabz.linecomparisonproblem;

public interface LineComparisonIF {
	
	public Double lengthOfLine(Point startPoint, Point endPoint);
	public void checkEqualLines(Double lengthOfLine1, Double lengthOfLine2);
	public void compareLines(Double lengthOfLine1, Double lengthOfLine2);
}
