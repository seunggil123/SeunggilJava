package �ǽ�6����;

public class ObjectTest {

	public static void main(String[] args) {
		
		Object[] str=new Object[4];

		str[0]=new Integer(20171234);
		str[1]=new String("ȫ�浿 �ڹټ���");
		str[2]=new Double(99.9);
		str[3]=new Character('A');
		
		for(int i=0; i<str.length; i++)
			System.out.print(str[i]);
		
		
		
	}

}
