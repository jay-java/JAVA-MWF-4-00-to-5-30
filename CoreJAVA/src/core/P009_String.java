package core;

public class P009_String {
	public static void main(String[] args) {
		String name = "hello java34564$%^^^";
		System.out.println(name);

		System.out.println(name.length());
		System.out.println(name.charAt(19));
		System.out.println(name.contains("help"));
		System.out.println(name.endsWith("edgf"));
		System.out.println(name.replace('l', 'q'));

		char c[] = name.toCharArray();

		String s1 = "java";
		String s2 = "java";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s3 = "			ja va			";
		System.out.println(s3.trim());

		String s4 = " ";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());

//		if (s1 == s2) {
//			System.out.println(true);
//		}
//
//		String s3 = new String("java");
//		String s4 = new String("java");
//		if (s3 == s4) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		sb.append(" java");
		System.out.println(sb);

	}
}
