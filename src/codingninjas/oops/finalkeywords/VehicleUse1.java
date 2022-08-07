package codingninjas.oops.finalkeywords;

import java.util.Scanner;

public class VehicleUse1 {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.color = "Black";
//		v.setMaxSpeed(10);
		//v.print();
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	
		Vehicle1 v;
		if (n == 0) {
			v = new Car1(10,20);
		} else {
			v = new Vehicle1(20);
		}
		//v.isConvertible();
		v.print();
		
//		Car c = new Car(10,20);
//		c.color = "Black";
//		c.setMaxSpeed(100);
		//c.print();
	}

}
