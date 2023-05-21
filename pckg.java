 package pckg;

	class abc implements pqr
	{
		s()
		{
			System.out.printkln("a");
		}
	}

package pckg;

	class xyz extends abc
	{
		s1()
		{
			System.out.prinln("x");
		}
	}
package pckg;
	interface pqr
	{
		void g();
	}
package pckg;
class mno
{
	public void g()
	{
		System.out.println("f");
	}
}
package pckg;
class def
{
	public static void main(String z[])
	{
		pqr m=new pqr();
		m.s();
		m.s1();
		m.g();
	}
}
		