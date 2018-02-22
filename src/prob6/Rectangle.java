package prob6;

public class Rectangle extends Shape implements Resizable{
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return (width+height)*2;
	}

	@Override
	public void resize(double s) {
		this.width=width*s;
		this.height=height*s;
	}
	
}
