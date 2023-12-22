package stringPrograms;

public class StringBufferExample {
	
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hi");
		sb.append("Hello");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		sb.delete(2, 4);
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.insert(1, "e");
		System.out.println(sb);
		
		sb.replace(0, 4, "Hello");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
	}

}
