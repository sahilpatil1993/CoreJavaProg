package OopConcepts;

public class GetterSetterMethod {
	
	private int a;					// Create a private variable

	public int getA() {				// Public the previous variable using get method
		return a;					// Return a variable, so that we can call it in the different class
	}

	public void setA(int b) {		// Use set method to assign variable
		this.a = b;
	}
	
	public static void main (String[] args)
	{
		GetterSetterMethod obj = new GetterSetterMethod();		// Create object for GetterSetter method
		obj.setA(4875);											// Set value for object using set method
		System.out.println(obj.getA());							// print the value using get method
	}
	
}
