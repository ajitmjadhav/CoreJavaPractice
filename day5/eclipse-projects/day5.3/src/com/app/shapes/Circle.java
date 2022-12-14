package com.app.shapes;

public class Circle extends BoundedShape{
	//state : x, y , radius
	private double radius;
	public Circle(int x,int y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	//toString
	@Override
	public String toString()
	{
		return "Circle "+super.toString()+" radius="+radius;
	}
	@Override
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}

}
