package tasks.assignment_14.Question07;

public class GasTank {
	
	private double amount = 0;
	private double capacity;
	
	public GasTank (double capacity) {
		this.capacity=capacity;		
	}
	
	public void addGas (double adding) {
		if ((amount+adding)<capacity) {
			amount+=adding;
		}else {
			amount = capacity;
		}
	}
	
	public void useGas (double usage) {
		if ((amount - usage) > 0) {
			amount -= usage;
		}else {
			amount = 0;
		}
	}
	
	public boolean isEmpty() {
		if(amount <0.1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull () {
		if (amount >(capacity-0.1)) {
			return true;
		}
		return false;
	}
	
	public double getGasLevel () {
		return amount;
	}
	
	public double fillUp () {
		return capacity - amount;
	}

}
