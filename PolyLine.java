package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PolyLine {

	// EX4- 1-- Array of points
	private Point[] listPoly;
	private LinkedList<Point> linkedList;

	
	
	// EX4- 1-- Constructor of PolyLine
	public PolyLine() {

		listPoly = new Point[5];
		linkedList = new LinkedList<Point>();

	}

	
	

	// EX4- 2-- this method will add points to the array - details of the question in the class TestPolyLine.java
	public void add(Point p) {

		for(int i=0; i<listPoly.length; i++) {

			if(listPoly[i] == null) {
				listPoly[i] = p;
				break;
			}

		}

		System.out.println(Arrays.toString(listPoly));

	}



	// EX4- 3-- this method will return the max capacity of the polyline
	public String pointCapacity() {
		return "The max capacity is: " + listPoly.length;
	}




	// EX4- 3-- this method will return the nb of points currently in the polyline
	public String nbPoints() {
		int count = 0;

		for(int i=0; i<listPoly.length; i++) {
			if(listPoly[i] != null) {
				count++;
			}
		}

		return "The current nb of points is: " + count;
	}



	// EX4- 4-- this method will return true if a given point is in the polyline
	public boolean contains(Point p) {
		for(Point point: listPoly) {
			if(p.equals(point)) {
				System.out.println("Point is in the polyline");
				return true;
			}
		}
		System.out.println("Point is not in the polyline");
		return false;
	}

	// EX4- 5-- if null is given, the polyline will be wrong because the polyline needs points to be drown.
	// the method Objects.requireNonNull(o) will check if the specified object is not null.
	// if it's not null, it will return the object, if null nothing.


	
	
	//EX4- 6-- this method will add points in the linkedlist
	public void addLinked(Point p) {
		linkedList.add(p);
	}
	
	

	// EX4- 6-- this method will return the max capacity of the polyline with the linkedList array
	public String pointCapacityLinked() {
		return "The max capacity is: " + linkedList.size();
	}


	// EX4- 6-- this method will return the nb of points currently in the polyline with the linkedList array
	public String nbPointsLinked() {
		int count = 0;

		for(int i=0; i<linkedList.size(); i++) {
			if(linkedList.get(i) != null) {
				count++;
			}
		}

		return "The current nb of points is: " + count;
	}
	
	
	// EX4- 6-- this method will return true if a given point is in the polyline with the linkedList array
		public boolean containsLinked(Point p) {
			for(Point point: linkedList) {
				if(p.equals(point)) {
					System.out.println("contains");
					return true;
				}
			}
			System.out.println("not contains");
			return false;
		}

}
