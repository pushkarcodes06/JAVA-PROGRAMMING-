package com.shapes;
public class Rectangle {
	double length, width;
	public Rectangle(double l, double w) { length = l; width = w; }
	public double area() { return length * width; }
}
 
// File: Test.java
import com.shapes.Rectangle;
public class Test {
	public static void main(String[] args) {
    	Rectangle r = new Rectangle(5, 3);
    	System.out.println("Area: " + r.area());
	}
}
