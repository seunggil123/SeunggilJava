package �ǽ�12;

public class TelevisionTest4 {

	public static void main(String[] args) {

		Television4 tv1 = new Television4();
		Television4 tv2 = new Television4();

		tv1.setOn(true);
		tv1.setChannel(7);
		tv1.setVolume(9);

		
		tv2.setOn(true);
		tv2.setChannel(27);
		tv2.setVolume(5);

		System.out.println("TV[����=" + tv1.isOn() + " ä��= " + tv1.getChannel()+ " �ҷ� = " + tv1.getVolume()+"]");
		System.out.println("TV[����=" + tv2.isOn() + " ä��= " + tv2.getChannel()+ " �ҷ� = " + tv2.getVolume()+"]");

		
	}

}
