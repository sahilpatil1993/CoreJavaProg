package interviewPrograms;

public class PalindromeIntegerNum {

	public static void main (String[] args)
	{
		int a =121;
		String s = String.valueOf(a);
		System.out.println("Saved int value in string =" + s);
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		int i = Integer.parseInt(sb.toString());
		System.out.println("Saved string value in integer =" + i);
		
		if (a==i)
		{
			System.out.println("Integer num is Palindrome");
		}
	}
}
