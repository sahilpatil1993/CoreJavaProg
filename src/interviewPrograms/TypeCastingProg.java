package interviewPrograms;

public class TypeCastingProg {

	public static void main(String[] args)
	{
		byte b = 10;
		short b1 = 11;
		
		byte sum = (byte)(b+b1);
		System.out.println(sum);
		
		int i = 100;
		short s = (short)i;
		System.out.println(s);
	}
}
