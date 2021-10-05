package fr.dauphine.javaavance.td1;

public class TestRing {

	public static void main(String[] args) {

		//EX6- 4-- The problem is that it prints the values only of the Circle class that it inherits without it's own parameters (
		// the inner radius). To fix it we need to override the toString method.

		Ring ring = new Ring(new Point(1,2), 50, 20);
		System.out.println(ring);
		
	
	}

}
