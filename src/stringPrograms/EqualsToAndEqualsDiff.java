package stringPrograms;

public class EqualsToAndEqualsDiff {

	public static void main(String[] args)
	{
		String s = "Sahil";
		String str = new String("Sahil");
		
		System.out.println( s == str );  // Compare address
		System.out.println(s.equals(str)); // compare contain 
		
		
	}
}
