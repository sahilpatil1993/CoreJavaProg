package oopsConcepts;

public class ChildInterfaceClass implements InterfaceSingleParent {

	@Override
	public void subtraction() {


	}
	
	public static void main(String[] args) {
		 
		InterfaceSingleParent parent =  new ChildInterfaceClass();
		parent.subtraction();
	}

}
