package interviewPrograms;

public class ReplaceSpecialCharacters {
	
	public static void main(String[] args)
	{
		String str = "C@unter$ign Te&hnolo#y";
		char[] ch = {'!','@','#','$','%','^','*','&'};
		
		for (int i=0; i<str.length(); i++)
		{
			for (int k=0; k<ch.length; k++)
			{
				if (str.charAt(i) == ch[k])
				{
					str = str.replace(str.charAt(i), 'X');
				}
			}
		}
		System.out.println(str);
	}

}
