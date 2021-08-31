package com.bridgelabz.linecomparisonproblem;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		LengthComparatorIF lengthComparator = new LengthComparatorImpl();
		
		System.out.println("----------Welcome To Line Comparison Computation Program----------");
		Point startPointLine1 = new Point();
		Point endPointLine1 = new Point();
		Point startPointLine2 = new Point();
		Point endPointLine2 = new Point();

		System.out.print("Enter Starting X Coordinate of Line 1: ");
		startPointLine1.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Starting Y Coordinate of Line 1: ");
		startPointLine1.setyCoordinate(scanner.nextInt());
		System.out.print("Enter Ending X Coordinate of Line 1: ");
		endPointLine1.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Ending Y Coordinate of Line 1: ");
		endPointLine1.setyCoordinate(scanner.nextInt());
		
		Line line1 = new Line(startPointLine1,endPointLine1);
		
		System.out.print("Enter Starting X Coordinate of Line 2: ");
		startPointLine2.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Starting Y Coordinate of Line 2: ");
		startPointLine2.setyCoordinate(scanner.nextInt());
		System.out.print("Enter Ending X Coordinate of Line 2: ");
		endPointLine2.setxCoordinate(scanner.nextInt());
		System.out.print("Enter Ending Y Coordinate of Line 2: ");
		endPointLine2.setyCoordinate(scanner.nextInt());
		
		Line line2 = new Line(startPointLine2,endPointLine2);
		
		scanner.close();

		System.out.println();

		lengthComparator.checkEqualLines(line1, line2);
		lengthComparator.compareLines(line1, line2);

		System.out.println("------------------------------------------------------------------");
	}
}