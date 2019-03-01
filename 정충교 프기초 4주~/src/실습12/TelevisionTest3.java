package ½Ç½À12;

public class TelevisionTest3 {

	public static void main(String[] args) {
	
		
		Television3 tv1 = new Television3();
		Television3 tv2 = new Television3();
		
		
		tv1.on = true;
		tv1.changeChannel(7);
		tv1.changeVolume(9);
		
		tv2.on = true;
		tv2.changeChannel(27);
		tv2.changeVolume(5);
		
		System.out.println(tv1.toString());
		System.out.println(tv2.toString());
		
		
	}

}
