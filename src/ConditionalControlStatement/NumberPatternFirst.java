package ConditionalControlStatement;

public class NumberPatternFirst {
	
	public static void main(String[] args)
	{
		//int a = 1;
		for (int i=0; i<5; i++)
		{
			char a = 'a';
			int b = 1;
			for (int j=4; j>i; j--)
			{
				System.out.print(" ");
			}
			
			if (i % 2 ==0) 
			{
				for (int k=0; k<=i; k++) 
				{
					System.out.print(a++ +" ");
				}
			}
			else
			{
				for (int k=0; k<=i; k++)
				{
					System.out.print(b++ +" ");
				}
			}
			System.out.println();
		}
	}

}
