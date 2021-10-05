package fr.dauphine.javaavance.td1;

public class TestPolyLine {

	public static void main(String[] args) {
		PolyLine polyLine = new PolyLine();
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(5, 6);
		Point p4 = new Point(7, 8);
		Point p5 = new Point(9, 10);
		Point p6 = new Point(11, 12);
		Point p7 = new Point(13, 14);

		// EX4- 2-- if we add more than the max capacity of the array, the new instances of points will not be stored in this array
		// because it's full, the max capacity is 5. So to solve it I suggest to use an ArrayList instead of array. In this way, we
		// will not have limited arrays, we can add as many as we want.

		polyLine.add(p1);
		polyLine.add(p2);
		polyLine.add(p3);
		//		polyLine.add(p4);
		//		polyLine.add(p5);
		//		polyLine.add(p6);
		//		polyLine.add(p7);

		System.out.println(polyLine.pointCapacity());
		System.out.println(polyLine.nbPoints());
		
		polyLine.contains(p6);
		
		
		


	}
}
