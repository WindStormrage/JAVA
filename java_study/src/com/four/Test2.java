package com.four;

interface Shape{
	double area(double a);
}

class Square implements Shape {
	public double area(double a){//实现抽象方法的时候要加Public
		return a*a;
	}
}

class Circle implements Shape {
	public double area(double a){
		return 2*3.14*a;
	}
	
}

public class Test2 {
	public static void main (String [] args){
		Square s = new Square();
		Circle c = new Circle();
		System.out.println(s.area(2));
		System.out.println(c.area(3));
	}
}
