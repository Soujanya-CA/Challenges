package com.technoelevate.Challenges;

public class Challenge2 {

	public static void main(String[] args) {
		
		System.out.println(area(50));
		System.out.println(area(-10));
		System.out.println(area(10,15));
		System.out.println(area(-1,-10));
	}
	
	public static double area(double radius) {
        if (radius >= 0) {
            return Math.PI * radius * radius;
        } else return -1;

    }
	
	public static double area(double x, double y) {
		if(x>=0 && y>=0) {
			return x*y;
		}else return -1;
	}
}
/*Write a method named area with one double parameter named radius. 
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 to indicate an invalid value.*/