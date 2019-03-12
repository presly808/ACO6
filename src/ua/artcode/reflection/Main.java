package ua.artcode.reflection;

public class Main {

	public static void main(String[] args) throws Exception
	{
		doRegular();
		doReflection();
	}

	public static void doRegular() throws Exception
	{
		long start = System.currentTimeMillis();
		for (int i=0; i<1000000; i++)
		{

		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void doReflection() throws Exception
	{
		long start = System.currentTimeMillis();
		for (int i=0; i<1000000; i++)
		{
			A.class.getFields();
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}

class A {


	public String name;

	public int doSomeThing(){
		return 0;
	}

}
