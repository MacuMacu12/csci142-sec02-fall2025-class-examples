package shapes;

public class Square {

	private float sidelength;
	private float area;
	
	public Square() {
		
		sidelength = 1.0f;
		area = 1.0f;
		
	}
	
	public Square(float sideLength) {
		sideLength = sideLength;
		area = sideLength * sideLength;
		
	}
	
	public float getArea() {
		
		return area;
	}

}
