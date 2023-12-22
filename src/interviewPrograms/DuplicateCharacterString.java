package interviewPrograms;

public class DuplicateCharacterString {
	
	public static void main(String[] args)
	{
		String s = "program";
		
		for (int i=0; i<s.length(); i++)
		{
			int count = 0;
			for (int k=0; k<s.length(); k++)
			{
				if (s.charAt(i) == s.charAt(k))
						{
							count++;
						}
			}
			System.out.println(s.charAt(i) + "=" + count);
			if (count > 1)
			{
				//System.out.println(s.charAt(i) + "is a duplicate chararcter");
				s = s.replaceAll(String.valueOf(s.charAt(i)), "");
			}
		}
	}

}
