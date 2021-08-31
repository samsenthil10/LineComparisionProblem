package com.bridgelabz.linecomparisonproblem;

public class LengthCalculatorImpl implements LengthCalculatorIF {

	@Override
	public Double lengthOfLine(Line line) {
		
		return Double.valueOf(Math.sqrt((Math.pow(line.lineEndingCoordinates.getxCoordinate() - line.lineStartingCoordinates.getxCoordinate(), 2))+(Math.pow(line.lineEndingCoordinates.getyCoordinate() - line.lineStartingCoordinates.getyCoordinate(), 2))));
	}
}