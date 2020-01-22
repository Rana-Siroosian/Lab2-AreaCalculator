package lab2;

import java.util.Scanner;

public class Lab2 {
public static void main (String [] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		String cont = "";
		double width;
		double length;
		double area;
		double perimeter;
		final int height = 5;
		double volume;
		
		do {
			System.out.print("Enter the width: ");
			width = scnr.nextDouble();
		
			System.out.print("Enter the length: ");
			length = scnr.nextDouble();
			
			System.out.println("The height is: " + height + "\n");
			
			volume = height * length * width;
			System.out.println("Volume: " + volume);
			
			area = width * length;
			System.out.println("Area: " + area);
		
			perimeter = 2 * (width + length);
			System.out.println("Perimeter: " + perimeter + "\n");
			
			System.out.println("Would you like to continue? y or n");
			
			cont = scnr.next();
			
			System.out.println();
		}
		while (cont.equals ("Y") || cont.equals("y"));
		
		System.out.println("Goodbye.");
		
		scnr.close();
	}
}

