package demo;

public class StringsExamples {

	public static void main(String[] args) {
		
		StringBuilder greeting = new StringBuilder();
		StringBuilder name = new StringBuilder();
		name.append("good morning");
		
		greeting = greeting.append("good");
		greeting.append(" morning");
		//System.out.println(greeting);
		//System.out.println(greeting == name);
		
		String str1 = "hello world";
		String str2 = "hello world";
		String str3 = " hello world".trim();
		//System.out.println(str1==str2);
		//System.out.println(str1==str3);
		
		String s1 = new String("faheem");
		String s2 = new String("faheem");
		String s3 = s1.toUpperCase();
		//System.out.println(s1.equals(s2));
		//System.out.println(s3);
		//System.out.println(s3.indexOf('H'));
		//System.out.println(s1.charAt(5));
		//System.out.println(s1.contains("en"));
		//System.out.println(s1.endswith);
		
		
		

	}

}
