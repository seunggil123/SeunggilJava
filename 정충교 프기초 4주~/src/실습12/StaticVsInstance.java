package �ǽ�12;

public class StaticVsInstance {

	public static void main(String[] args) {
		
		String str = "�״밡 �翡 �־ ���� �״밡 �׸���. ";
		String sub = str.substring(4,10);
		System.out.println(sub);
		
		System.out.println("�״밡 �翡 �־ ���� �״밡 �׸���. ".substring(4,10));
		double x = 15.3;
		String value = String.valueOf(x);
		
		for(int i=0; i<value.length(); i++)
		System.out.println(value.charAt(i));
	}

}
