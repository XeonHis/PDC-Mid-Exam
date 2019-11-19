package Q3;

import java.util.Scanner;

public class Q3Main
{
	public static void main(String[] args)
	{
		//add your code here
		Circle aCircle = new Circle(3.2);
		aCircle.shapeCalculate();
		System.out.println("The area size = " + aCircle.area + "\nThe circumference = " + aCircle.circumference);
	}
}