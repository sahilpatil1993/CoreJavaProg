package ConditionalControlStatement;

public class ForStatement {

	public static void main(String[] args)
	
	{
		//for (int i=0; i<=5; i++)
		//{
		//	System.out.println(i);
		//}
		
		//One Dimensional Array
		
		//int arrayName[] = {1,2,3,4,5};
		//for(int i=0; i < arrayName.length; i++)
		//{
		//	System.out.println(arrayName[i]);
		//}
		
		//Two Dimensional Array
		
		int two[][] = { {11,12},{13,14},{15,16} };
		
		for (int i=0; i < two.length; i++)
		{
			for (int j=0; j < two[i].length; j++)
			{
				System.out.println(two[i][j]);
			}
		}
	}
}
