class A
{}
class demo
{
public static void main(String []as)
{
		demo a=new demo();
		demo a1=new demo();
	// String s1=new String("ram");
	a.finalize();
	a1.finalize();
	// Runtime.getRuntime().gc();
	// System.gc();
	// System.out.println(s1);
	System.out.println("softwaves");
}
public void finalize()
{
	System.out.println("fg");
	System.out.println(10/0);
}
}

