package tasks.assignment_14.Question05;

public class TVTest {

	public static void main(String[] args) {
		
		TV tv1 = new TV("SONY");
		tv1.isOn();
		tv1.turnOn();
		
		tv1.setVolumeLevel(4);
		tv1.setChannel(110);
		
		tv1.isOn();
		System.out.println(tv1.getBrand());
		System.out.println(tv1.getChannel());
		System.out.println(tv1.getVolumeLevel());
		
		tv1.channelDown();
		System.out.println(tv1.getChannel());
		tv1.channelUp();
		System.out.println(tv1.getChannel());
		
		tv1.setChannel(130);
		System.out.println(tv1.getChannel());
		tv1.setChannel(0);
		System.out.println(tv1.getChannel());
		
		System.out.println(tv1.getVolumeLevel());
		tv1.setVolumeLevel(10);
		System.out.println(tv1.getVolumeLevel());
		tv1.volumeDown();
		System.out.println(tv1.getVolumeLevel());
		

	}

}
