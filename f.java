class d
{
	void s()
	{
		int a=2;
	System.out.println(a);
	
	}
}
class e extends d
{
	void s()
	{
		int x=4;
	System.out.println(x);
	super.s();
	}
}
class f
{
	public static void main(String z[])
	{
	e g=new e();
	
	g.s();
	}
}