package a.b.c;
import a.b.*;

public class c3
{
	public void s2()
	{
		System.out.println("x");
	}
}
class xyz
{
	public static void main(String z[])
	{
		c3 o=new c3();
		o.s2();
		
		c2 i=new c2();
		i.s1();
	}
}