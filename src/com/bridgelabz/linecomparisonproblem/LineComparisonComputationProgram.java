package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonComputationProgram {

	public static void main(String[] args) {

		System.out.println("----------Welcome To Line Comparison Computation Program----------");
		int xStartingCoordinate,xEndingCoordinate,yStartingCoordinate,yEndingCoordinate;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Line 1 Coordinates (x1,y1) and (x2,y2): ");
		xStartingCoordinate=scanner.nextInt();
		yStartingCoordinate=scanner.nextInt();
		xEndingCoordinate=scanner.nextInt();
		yEndingCoordinate=scanner.nextInt();
		Double lengthOfLine1 = Double.valueOf(Math.sqrt(Math.pow((xEndingCoordinate-xStartingCoordinate),2)+Math.pow((yEndingCoordinate-yStartingCoordinate),2)));
		
		System.out.print("Enter Line 2 Coordinates (x1,y1) and (x2,y2): ");
		xStartingCoordinate=scanner.nextInt();
		yStartingCoordinate=scanner.nextInt();
		xEndingCoordinate=scanner.nextInt();
		yEndingCoordinate=scanner.nextInt();
		Double lengthOfLine2 = Double.valueOf(Math.sqrt(Math.pow((xEndingCoordinate-xStartingCoordinate),2)+Math.pow((yEndingCoordinate-yStartingCoordinate),2)));
		
		scanner.close();
		
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Two Lines Are Equal");
		}
		else {
			System.out.println("Two Lines Are Not Equal");
		}
		System.out.println("------------------------------------------------------------------");
	}
}