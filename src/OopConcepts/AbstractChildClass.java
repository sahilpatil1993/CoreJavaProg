package oopsConcepts;

public class AbstractChildClass extends SingleAbstractParentClass {

	@Override
	public void addition() {

	}

	public void mul() {

	}


	public static void average() {

		System.out.println("Abstract clas Avg method");

	}

	public static void main(String[] args) {
		
		SingleAbstractParentClass abstractParent = new AbstractChildClass();
		abstractParent.print();
				
				
				
	}
}
