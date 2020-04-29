package tasks.assignment_14.Question01;

public class Atts {
	
	public String name;
	public String color;
	public int amount;
	
	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", amount=" + amount;
	}

}

class Test {
	public static void main(String[] args) {
		Atts a = new Atts();
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		
		System.out.println(a.toString());
		
	}
}
