package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		// EX2- 2-- It will generate an error because the variables are private, we can't access them anymore, it is only visible in the
		// class itself where they are declared. To fix it, we need to create getters and setters and use the get method that returns 
		// the variable value.

		//Point p = new Point();
		//System.out.println(p.x + " " + p.y);


		// EX2- 3-- We set all fields visibility to private to protect the variable and not allow anyone to change the
		// value of this variable, so in this way it will encapsulate it.


		// EX2- 4-- an accessor is a method that returns the private variable so we can access them in other classes. 
		// Yes, we need to create an accessor because here, the variables are private fields and it's the best way to prevent the change
		// of any value and protect it.



		// EX2- 7-- displaying the number of Points
		Point pCountPoints = new Point();
		Point pCountPoints2 = new Point();
		System.out.println("Number of points created: " + pCountPoints.getStaticCount());



		Point p = new Point(10,20);

		// EX2- 9-- Printing the coordinated of x and y as (x,y)
		System.out.println(p);







		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);

		System.out.println(p1==p2);
		System.out.println(p1==p3);

		// EX3- 1-- The first one will print true and the second false.
		// We created p1 so it has a reference. We assigned now p1 at p2 that are instances of Point so now p2 points to the same
		// reference of p1, thats why when we compare them it returns true.
		// Now p3 is a new instance of Point so even if it has the same coordinates as parameters it has a new reference to Point, 
		// so when we compare p1 with p3 they don't match because they don't point to the same reference. p3 is a new reference. 
		// We aren't comparing values but only references, that's why it returns false.


		// EX3- 2-- Testing the method if p1 is same as p3.
		p1.isSameAs(p3);



		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);

		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

		// EX3- 3-- We added p1 to the list. Since p1 = p2, indexOf will 0 because it is the first occurrence of the element in the
		// arraylist. For p3, indexOf is returning -1 but it shouldn't because p3 has the same coordinates of p1 and p2.
		// To fix it we need to override the equals method and test if the coordinates are equals, return true.

	}

}
