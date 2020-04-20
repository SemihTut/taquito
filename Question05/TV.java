package tasks.assignment_14.Question05;

public class TV {
	
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";
	
	public TV () {
		System.out.println("Creating TV object using no Args-constructor");
	}
	
	public TV (String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg-constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		
		if (channel <=0 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channe");
		}else {
			this.channel = channel;
		}
		
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on && volumeLevel>=1 && volumeLevel<=7 ) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if (channel!=120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if (channel!=1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(volumeLevel!=7) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if (volumeLevel!=1) {
			volumeLevel--;
		}
	}
	
	public void isOn() {
		if (on) {
			System.out.println("Yes TV is ON");
		}else {
			System.out.println("No, TV is OFF");
		}
	}
	
	public void turnOn() {
		if (on) {
			System.out.println("TV is already ON");
		}else {
			on = true;
		}		
	}
	
	public void turnOff() {
		if (!on) {
			System.out.println("TV is already OFF");
		}else {
			on = false;
		}		
	}
	
	
	

}
