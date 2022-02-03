package oopsAssignment;
abstract class Shape{
	abstract public String draw();
}

class Rectangle extends Shape{

	@Override
	public String draw() {
		
		return "Drawing Rectangle";
	}
	
}

class Line extends Shape{

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Drawing Line";
	}
}

class Cube extends Shape{

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Drawing Cube";
	}
	
}


public class Assignment2Q5 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r.draw());
		
		Line l = new Line();
		System.out.println(l.draw());

		Cube c = new Cube();
		System.out.println(c.draw());

	}

}
