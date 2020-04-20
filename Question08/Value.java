package tasks.assignment_14.Question08;

public class Value {
	
	private int val;
	private int checkPoint = 0;
	
	public Value (int val) {
		this.val = val;
		checkPoint =1;
	}
	
	public Value () {
		
	}
	
	public int setVal (int val) {
		this.val = val;
		checkPoint = 2;
		return val;
	}
	
	public boolean wasModified () {
		if(checkPoint ==2) {
			return true;			
		}
		return false;
	}
	
	public int getVal () {
		return val;
	}
	
	

}
