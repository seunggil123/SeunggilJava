package �ǽ�12;

public class TelevisionTest2 {

	public static void main(String[] args) {
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		
		tv1.on = true;
		tv1.changeChannel(7);
		tv1.changeVolume(9);
		
		System.out.println("TV[����=" + tv1.on + " ä��= " + tv1.getChannel()+ " �ҷ� = " + tv1.getVolume()+"]");
		
		tv2.on = true;
		tv2.changeChannel(27);
		tv2.changeVolume(5);
		
		System.out.println("TV[����=" + tv2.on + " ä��= " + tv2.getChannel()+ " �ҷ� = " + tv2.getVolume()+"]");
		
	}

}
