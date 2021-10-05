package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private double radius;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// EX5- 3-- toString method 
	public String toString() {
		return "center: " + this.center + ", radius: " + this.radius + ", area: " + area();
	}


	// EX5- 4-- translate method
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);

	}

	//EX5- 6-- getCenter method
	public Point getCenter() {
		Point storePoint = new Point(this.center);
		return storePoint;
	}

	
	// EX5- 7-- area method
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	// EX5- 8-- contains method
	public boolean contains(Point p) {
		double pointOnCircle = 0;

		pointOnCircle = Math.pow(this.radius, 2);
		System.out.println(pointOnCircle);
		System.out.println(p.getX());
		System.out.println(p.getY());
		if(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2) < pointOnCircle) {
			System.out.println("inside the circle");
			return true;
		}
		System.out.println("outside the circle");
		return false;
	}


	// EX5- 9-- contains method with 2 params. Because it's an array of circles, we should use a for loop
	public boolean contains(Point p, Circle[] circles) {
		double pointOnCircle = 0;

		pointOnCircle = Math.pow(this.radius, 2);
		for(int i=0; i<circles.length; i++) {
			if(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2) < pointOnCircle) {
				System.out.println("inside the circle: " + circles[i]);
			}
			System.out.println("outside the circle: " + circles[i]);
		}
	
		return false;

	}
}



