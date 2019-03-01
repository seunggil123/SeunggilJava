
public class Myprog {

	static int Count =0; static int CA=0; static int CB=0;
	
	static class BodyA implements Runnable
	{
		public void run()
		{
				CA++; Count++;
				System.out.println("A�纸 �� : " +CA);
				Thread.yield(); //������ ���� �纸 bodyA���� bodyB�� �̵�(������t1 -> ������t2)
				Count++; CA++; //
				System.out.println("A�纸�� " + CA);
		}
	}
	static class BodyB implements Runnable
	{
		public void run()
		{
			while(CB <5)
			{
				CB++; Count++;
				System.out.println("B�纸 �� : " +CB);
				Thread.yield();
				System.out.println("B�纸�� " + CB);
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
