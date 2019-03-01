package 실습13;

public class SplitterTest {

	public static void main(String[] args) {
	
		Splitter splitter = new Splitter("Twice!");
		char[] carray = splitter.split();
		//객체가 메소드 호출
		for(int i=0; i< carray.length; i++)
		{
			System.out.println(carray[i]);
		}
		
	}

}
