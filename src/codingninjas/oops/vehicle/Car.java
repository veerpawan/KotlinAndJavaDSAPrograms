package codingninjas.oops.vehicle;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	
	public Car() {
		System.out.println("Car Constructor");
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
