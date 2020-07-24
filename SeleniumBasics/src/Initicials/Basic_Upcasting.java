package Initicials;

class Parent
{
	void disp()
	{
		System.out.println("disp in sample");
	}
}

class Child extends Parent
{
	void demo()
	{
		System.out.println("demo in sample2");
	}
}	


public class Basic_Upcasting 
{
	public static void main(String[] arg)
	{
		// Upcasting
     Parent arg1 = (Parent) new Child();
        // Downcasting
     Child arg2 =(Child) arg1;
     arg2.demo();
     arg2.disp();
	}
}

