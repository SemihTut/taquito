package tasks.assignment_14.Question06;

public class ParkTest {

	public static void main(String[] args) {
		
		ParkingMeter p1 = new ParkingMeter(40);
		
		p1.add(25);
		
		System.out.println(p1.isExpired());
		
		p1.tick();
		

	}

}
