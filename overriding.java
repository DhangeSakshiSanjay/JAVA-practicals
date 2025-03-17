import java.util.*;
class A
{
	void disp()
	{
		System.out.println("Welcome to the world of programming");
	}
}
class B extends A
{	void disp()
	{
		super.disp();	
		System.out.println("Hii, I am Vaishnavi");
	}
}
class overriding
{
	public static void main(String args[])
	{
		B obj =new B();
		obj.disp();
	}
}
