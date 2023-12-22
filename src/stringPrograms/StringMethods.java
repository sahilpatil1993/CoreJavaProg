package stringPrograms;

public class StringMethods {
	
	public static void main(String[] args)
	{
	
	String s1 = new String("");
		
	String s2 = new String("Program");
	System.out.println(s2);
	
	char[] ch = {'a','b','c','d','d'}; // created array
	String s3 = new String(ch);    // Created Object
	System.out.println(s3);
	
	char c = s3.charAt(1);		// returns char value at required index
	System.out.println(c);
	
	System.out.println(s3.compareTo(s2));	// compare two strings, when string is matched result become '0'.
	
	String s4 = "ABCD";
	System.out.println(s3.compareToIgnoreCase(s4)); // comapre two strings by ignoring case difference
	
	System.out.println(s3.concat(s4));  // combine or join two strings
	
	System.out.println("Updated value of s3 =" + s3);
	
	boolean t = s3.contains("wxyz"); 	// checks characters are present in the object or not (results are in true or false)
	System.out.println(t);
	System.out.println(s3.contains("abcd"));
	
	boolean e = s3.endsWith("cd");		// checks if this string ends with the specified suffix
	System.out.println(e);
	System.out.println(s3.endsWith("ab"));
	
	int i = s3.indexOf("b");			// find out the index value of specified char
	System.out.println(i);
	System.out.println(s3.indexOf("d"));
	
	boolean l = s3.isBlank();			// returns true if string is empty
	System.out.println(l);
	System.out.println(s1.isBlank());
	
	boolean m = s3.isEmpty(); 			// returns true if and only length = 0
	System.out.println(m);
	System.out.println(s1.isEmpty());
	
	int n = s3.lastIndexOf("d"); 		// returns last index of specified character within the string
	System.out.println(n);
	System.out.println(s3.lastIndexOf("d"));
	
	System.out.println(s2.toCharArray());	// convert this string to new character array
	
	System.out.println(s2.toUpperCase());	// convert all characters in this string to upper case
	
	}

}
