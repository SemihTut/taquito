package tasks.assignment_14.Question09;

import static tasks.assignment_14.Question09.Telephone.*;

public class TelephoneTest {

	public static void main(String[] args) {
		
		Telephone t1 = new Telephone();
		
		t1.setNumber("3008467");
		
		System.out.println(t1.getNumber());
		
		System.out.println(t1.total);
		System.out.println(t1.quantity);
		
		System.out.println(Telephone.total);
		System.out.println(Telephone.quantity);
		
		System.out.println(total);
		System.out.println(quantity);

	}

}
