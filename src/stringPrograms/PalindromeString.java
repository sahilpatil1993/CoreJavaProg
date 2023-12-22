package stringPrograms;

public class PalindromeString {
	
	public static void main(String[] args)
	{
		String c = "madam";
		StringBuffer sb = new StringBuffer(c);
		sb.reverse();
		System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(s);
		
		System.out.println(c.equals(s));
			
	}

}
