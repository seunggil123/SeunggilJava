package �ǽ�12;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.on = true;
		tv.changeChannel(7);
		tv.changeVolume(9);
		
		System.out.println("TV[����=" + tv.on + " ä��= " + tv.getChannel()+ " �ҷ� = " + tv.getVolume()+"]");
		
		
		
		
		
	}

}
