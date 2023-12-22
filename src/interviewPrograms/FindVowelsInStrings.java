package interviewPrograms;

public class FindVowelsInStrings {

	public static void main(String[] args)
	{
		String s = "countersign technology";
		
		char[] vowel = {'a','e','i','o','u'};
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < vowel.length; j++)
			{
				if (vowel[j] == s.charAt(i))
				{
				System.out.println(s.charAt(i));
				}
			}
		}
	}
}
