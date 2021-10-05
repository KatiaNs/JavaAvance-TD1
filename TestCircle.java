package fr.dauphine.javaavance.td1;

public class TestCircle {

	public static void main(String[] args) {

		Point p = new Point(1,2);
		Point p2 = new Point(3,4);

		Circle c = new Circle(p,1);
		Circle c2 = new Circle(p2,2);

		c2.translate(1,1);

		System.out.println(c + " " + c2);
		// EX5- 5-- The problem is that we are using the same instance of Point, so when we are calling the translate method and giving
		// it new parameters it is affecting the values of c and c2 with the new parameters. it override the values.
		// To avoid it we need to create another instance of Point, for example p2, and affecting it to a class of Circle as parameters
		// for example c2. So we are not using anymore the same instance for the circle instance.




		// EX5- 6--The problem is that getCenter() is supposed to return the center, but the translate method is overriding it with
		// the new coordinates.
		Circle c3=new Circle(new Point(1,2), 300);
		c3.getCenter().translate(1,1);
		System.out.println(c3);

		Point pTestInside = new Point(30,40);

		c3.contains(pTestInside);

	}

}
