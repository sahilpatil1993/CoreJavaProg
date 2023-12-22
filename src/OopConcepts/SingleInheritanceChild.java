package oopsConcepts;
//childClassName extends ParentClass
public class SingleInheritanceChild extends SingleInheritanceParent {
	
	/*
	 * SingleInheritanceChild(){ this("wsxdf");
	 * System.out.println("Single Inheritance Child Constructor");
	 * 
	 * }
	 * 
	 * SingleInheritanceChild(String a){ //super(a);
	 * 
	 * System.out.println("Single Inheritance Child Constructor with parameter "+a);
	 * 
	 * }
	 */
	public void m1() {
		System.out.println("Single Inheritance Child m1 method");
	}
	
	public void run() {
		super.m1();
		super.m2();
		this.m1();
	}
	
	public static void main(String[] args) {
		//SingleInheritanceChild ch = new SingleInheritanceChild();
		SingleInheritanceChild child = new SingleInheritanceChild();
		//child.m1();
		//m2();
		child.a = 10;
		//System.out.println(child.a);
		//child.m
		SingleInheritanceParent parent = new SingleInheritanceParent();
		//parent.m1();
		
		//child.run();
	
		
		//SingleInheritanceChild child = new SingleInheritanceChild();
		SingleInheritanceParent parentChild = new SingleInheritanceChild();
		parentChild.print();
		 
	}

}
