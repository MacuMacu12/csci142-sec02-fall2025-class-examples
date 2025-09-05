package shapes;

public class Square {

	private double sidelength;
	
	public Square() {
		
		this.sidelength = 1.0;
		
	}
	

	
	public Square(double sidelength) {
		if(sidelength <= 0) {
			throw new IllegalArgumentException("Sidelength must be a positive number");
		} 
		else {
			this.sidelength = sidelength;
		}
		
	}

	public double getSidelength() {
		return sidelength;
	}

	public void setSidelength(double sidelength) {
		
		if(sidelength <= 0) {
			throw new IllegalArgumentException("Sidelength must be positive number");
		}
		else {
			this.sidelength = sidelength;
		}
		
	}

	public double getArea() {
		return this.sidelength * this.sidelength;
	}
	
	
	    public String toString() {
	        return "Side Length = " + this.sidelength;
	    }
	

}
