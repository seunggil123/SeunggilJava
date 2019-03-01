package ½Ç½À12;

public class TelevisionTest2 {

	public static void main(String[] args) {
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		
		tv1.on = true;
		tv1.changeChannel(7);
		tv1.changeVolume(9);
		
		System.out.println("TV[ÄÑÁü=" + tv1.on + " Ã¤³Î= " + tv1.getChannel()+ " ºÒ·ý = " + tv1.getVolume()+"]");
		
		tv2.on = true;
		tv2.changeChannel(27);
		tv2.changeVolume(5);
		
		System.out.println("TV[ÄÑÁü=" + tv2.on + " Ã¤³Î= " + tv2.getChannel()+ " ºÒ·ý = " + tv2.getVolume()+"]");
		
	}

}
