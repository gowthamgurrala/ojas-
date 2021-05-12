package Assign51092;

public class Square extends Shape{

	float side;
	
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void getArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getPerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
}
