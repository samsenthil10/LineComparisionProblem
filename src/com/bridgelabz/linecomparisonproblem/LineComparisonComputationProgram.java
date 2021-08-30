package com.bridgelabz.linecomparisonproblem;

import java.util.*;

public class LineComparisonComputationProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LineComparisonIF lineComparision = new LineComparisonImpl();
		System.out.println("----------Welcome To Line Comparison Computation Program----------");
		Point startPoint = new Point();
		Point endPoint = new Point();

		System.out.print("Enter Starting X Coordinate of Line 1: ");
		startPoint.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Starting Y Coordinate of Line 1: ");
		startPoint.setyCoordinate(scanner.nextInt());
		System.out.print("Enter Ending X Coordinate of Line 1: ");
		endPoint.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Ending Y Coordinate of Line 1: ");
		endPoint.setyCoordinate(scanner.nextInt());
		Double lengthOfline1= lineComparision.lengthOfLine(startPoint, endPoint);

		System.out.print("Enter Starting X Coordinate of Line 2: ");
		startPoint.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Starting Y Coordinate of Line 2: ");
		startPoint.setyCoordinate(scanner.nextInt());
		System.out.print("Enter Ending X Coordinate of Line 2: ");
		endPoint.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Ending Y Coordinate of Line 2: ");
		endPoint.setyCoordinate(scanner.nextInt());
		Double lengthOfline2= lineComparision.lengthOfLine(startPoint, endPoint);
		scanner.close();

		System.out.println();

		lineComparision.checkEqualLines(lengthOfline1, lengthOfline2);
		lineComparision.compareLines(lengthOfline1, lengthOfline2);

		System.out.println("------------------------------------------------------------------");
	}
}