package �ǽ�13;

public class SplitterTest {

	public static void main(String[] args) {
	
		Splitter splitter = new Splitter("Twice!");
		char[] carray = splitter.split();
		//��ü�� �޼ҵ� ȣ��
		for(int i=0; i< carray.length; i++)
		{
			System.out.println(carray[i]);
		}
		
	}

}
