package ½Ç½À12;

public class StringExample {

	public static void main(String[] args) {
		
		String s = "I am a programmar!";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		
		System.out.println(s.indexOf('m'));
		System.out.println(s.lastIndexOf('m'));
		
		System.out.println(s.contains("!"));
		System.out.println(s.contains("i"));
		
		char[] elements = s.toCharArray();
		for(char el : elements)
			System.out.println(el);
		
		String a = new String("Computer");
		String c = new String("Computer");
		String b = null;
		b=a;
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equals(b));
		
		
		
	}

}
