package pkgMain;

import java.util.Scanner;

public class QuarterBack 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double TD;
		double Y;
		double Int;
		double Comp;
		double ATT;
		System.out.println("How many Touch downs?");
		TD = input.nextDouble();
		System.out.println("How many Yards?");
		Y = input.nextDouble();
		System.out.println("How many Interceptions?");
		Int = input.nextDouble();
		System.out.println("How many Completions?");
		Comp = input.nextDouble();
		System.out.println("How many attempts?");
		ATT = input.nextDouble();
		input.close();
		
		System.out.println(QBStats(TD,Y,Int,Comp,ATT));
	}
	public static double QBStats(double TD, double Y, double Int, double Comp, double ATT)
		{
		double a;
		double b;
		double c;
		double d;
		double total;
		a = (Comp / ATT - .3) *5;
		b = (Y/ATT - 3) * .25;
		c = (TD/ATT) * 20;
		d = 2.375 - (Int/ATT * 25);
		total = ((a+b+c+d)/6) * 100;
		if(total < 158.3)
		{
			return total;
		}
		else
		{
			return 158.3;
		}
	}	
}
