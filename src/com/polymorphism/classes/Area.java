package com.polymorphism.classes;

public class Area {
	
public void area(int side){
	int area = side*side;
	System.out.println("The Area of Square is = "+area);
}

public void area(int length,int breadth){
	int area = length*breadth;
	System.out.println("The Area of Rectangle is = "+area);
}

public void area(double height, double base){
	double area = (height*base)/2;
	System.out.println("The Area of triangle is = "+area);
}

public static void main(String[] args){
	Area a = new Area();
	a.area(20);
	a.area(15, 4);
	a.area(10, 6.5);
}

}
