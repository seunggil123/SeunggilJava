package ½Ç½À12;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.on = true;
		tv.changeChannel(7);
		tv.changeVolume(9);
		
		System.out.println("TV[ÄÑÁü=" + tv.on + " Ã¤³Î= " + tv.getChannel()+ " ºÒ·ý = " + tv.getVolume()+"]");
		
		
		
		
		
	}

}
