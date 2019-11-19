package Q3;


class Circle extends Shape
{
	double radius;
	double area;
	double circumference;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public void shapeCalculate()
	{
		area = 3.14 * radius * radius;
		circumference = 2 * 3.14 * radius;
	}
}
