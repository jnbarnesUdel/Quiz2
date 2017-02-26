package mainQ2;

import java.util.Scanner;

public class Tuition 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double initalTuitionCost;
		double percentIncreases;
		double Year = 1;
		double PlannedYears = 4;
		System.out.println("What is the inital tuition cost?");
		initalTuitionCost = input.nextDouble();
		System.out.println("What is the percent Increas in tutinion?");
		percentIncreases = input.nextDouble();
		input.close();
		
		System.out.println(calculateTuition(initalTuitionCost, percentIncreases, Year, PlannedYears));
	}
	public static double calculateTuition(double initalTuitionCost, double percentIncreases, double Year, double PlannedYears)
	{
		double cost = 0;
		double tuition = initalTuitionCost;
		for(double x = Year; x<= PlannedYears; x++)
		{
			cost = cost + tuition;
			tuition = tuition + tuition * percentIncreases;
		}
		return cost;
	}
}
