package Day5;

public class Shape {

	float area(float pi, float radius)
	{
		return pi*radius*radius;
	}
	
	int area(int length, int breath)
	{
		return length*breath;
	}
	
	int area(int side)
	{
		return side*side;
	}
}
