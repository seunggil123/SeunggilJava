
public class Myprog {

	static int Count =0; static int CA=0; static int CB=0;
	
	static class BodyA implements Runnable
	{
		public void run()
		{
				CA++; Count++;
				System.out.println("A양보 전 : " +CA);
				Thread.yield(); //스레드 순서 양보 bodyA에서 bodyB로 이동(스레드t1 -> 스레드t2)
				Count++; CA++; //
				System.out.println("A양보후 " + CA);
		}
	}
	static class BodyB implements Runnable
	{
		public void run()
		{
			while(CB <5)
			{
				CB++; Count++;
				System.out.println("B양보 전 : " +CB);
				Thread.yield();
				System.out.println("B양보후 " + CB);
			}
		}
	}
	
	public static void main(String[] args) {
		
		BodyA rA = new BodyA();
		BodyB rB = new BodyB();
		Thread t1 = new Thread(rA);
		Thread t2 = new Thread(rB);
		t1.start(); t2.start(); 
	}
}
