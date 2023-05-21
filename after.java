class a
{
	void s()
	{
		
	System.out.println("a");
	}
	void s1()
	{
		System.out.println("aa");
	}
}
class b extends a
{
	void s()
	{
		System.out.println("b");
	}
	void s1()
	{
		System.out.println("bb");
	}
}
class after
{
	public static void main(String z[])
	{
		a a1=new a();
		a1.s();
		b b1=new b();
		b1.s();
		a a2=new b();
		a2.s();
		a2.s1();
		b b2=new a();
		b2.s();
		b2.s1();
	}
}
