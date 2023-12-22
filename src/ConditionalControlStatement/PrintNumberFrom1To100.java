package ConditionalControlStatement;

public class PrintNumberFrom1To100 {
	
	public static void evenNum()
	{
		System.out.println("\nEven Numbers =");
		for (int i=1; i<=100; i++)
		{
			if (i % 2 ==0)
			{
				System.out.println(i +"");
			}
		}
	}
	
	public static void oddNum()
	{
		System.out.println("\nOdd Numbers =");
		for (int i=1; i<=100; i++)
		{
			if (i % 2 !=0)
			{
				System.out.println(i +"");
			}
		}
	}
	
	public static void primeNum()
	{
		for (int a = 1; a<=100; a++) {
			
		int count = 0;
		
		for (int i=1; i<=a/2; i++)
		{
			int b = a % i;
			if (b == 0) {
				count++;
			}
		}
		if (count == 1)
		{
			System.out.println("\nNumber is prime =" + a);
		}
		else
			System.out.println("\nNumber is not prime =" + a);
		}
	}
	
	public static void main(String[] args)
	{
		evenNum();
		oddNum();
		primeNum();
	}

}
