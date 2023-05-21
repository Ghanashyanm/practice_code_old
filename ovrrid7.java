class ovrrid
{
	int a=2;
	void s()
	{
		System.out.println(a);
	}
}
class ovrrid1 extends ovrrid
{
	int a;
	void s1()
	{
		System.out.println(a);
	}
}
class ovrrid7
{
	public static void main(String z[])
	{
		ovrrid b1=new ovrrid();
		b1.a=3;
		b1.s();
		ovrrid1 b2=new ovrrid1();
		b2.a=4;
		b2.s();
		b2.s1();
	}
}