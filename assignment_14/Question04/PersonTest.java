package tasks.assignment_14.Question04;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);
		
		System.out.println(person.toString());
		
		Person person2 = new Person("Fatima", "Lee" ,22);
		
		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
		
		

	}

}
