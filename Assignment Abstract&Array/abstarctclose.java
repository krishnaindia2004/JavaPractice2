package com.Practise;

abstract class Addition{
	
	abstract void add();
	
	public void sub()
	{
		System.out.println("Subraction");
	}
}

abstract class ImplementedMethod extends Addition{
	abstract void division();
	public void multipy()
	{
		System.out.println("Multiplication");
	}
}	

public class abstarctclose extends ImplementedMethod {
	void add() {
		System.out.println("Addition");
	}
	void division() {
		System.out.println("Division");
	}
	

	public static void main(String[] args) {
		abstarctclose c =new abstarctclose();
		c.add();
		c.sub();
		c.multipy();
		c.division();
		
	}

}
