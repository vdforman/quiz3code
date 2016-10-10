package vicQuiz3;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(double side1, double side2, double side3)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	@Override
	public double getPerimeter()
	{
		return side1+side2+side3;
	}
	
	@Override
	public double getArea()
	{
		double halfSide = ((side1+side2+side3)/2);
		double area = Math.sqrt(halfSide*(halfSide-side1)*(halfSide-side2)*(halfSide-side3));
		
		return area;
	}
	
	@Override
	public String toString()
	{
		return("Side 1 is "+ this.getSide1()+"\n"
				+"Side 2 is "+ this.getSide2()+"\n"
				+"Side 3 is "+ this.getSide3()+"\n"
				+"The perimeter of this triangle is "+ this.getPerimeter()+"\n"
				+"The area of this triangle is "+ this.getArea()+"\n");
	}

}
