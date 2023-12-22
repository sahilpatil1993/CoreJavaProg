package interviewPrograms;

public class TruncateSpecialCharAndNum {
	
	public static void main(String[] args)
	{
		String str = "Te$t!n9";
		String regx = "[^a-zA-Z]";
		
		str = str.replaceAll(regx, "");
		
		System.out.println("Expected = " + str);
	}

}
