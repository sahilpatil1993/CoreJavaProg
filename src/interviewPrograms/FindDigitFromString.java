package interviewPrograms;

public class FindDigitFromString {
	
	public static void main(String[] args)
	{
		String s = "a6r8tr5d8e7";			// Taken String
		char[] a = s.toCharArray();			// convert it into char array
		int sum = 0;				
		for (char ch : a)					// use for-each loop to separate each characters
		{
			if (Character.isDigit(ch)) 		// find out only digits from separated characters
			{
				System.out.println(ch);		// print out found digits
				int i = Character.getNumericValue(ch);		// convert Char digits into Integer digits
				sum = Integer.sum(i, sum);					// sum the integer digits 
			}
		}
		System.out.println("Sum of Number =" + sum);		// print out the sum
	}

}
