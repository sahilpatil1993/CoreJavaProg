package interviewPrograms;

public class CapitalFirstCharOfEachLetter {

	public static void main(String[] args)
	
	{
		String s = "sahil ashok patil";
		
		String[] str = s.split(" ");
		
		System.out.println(str[0]+str[1]+str[2]);
		
		for (int i=0; i<str.length; i++)
		{
		System.out.print(str[i].substring(0, 1).toUpperCase() + str[i].substring(1) + " ");
		}
	}
}
