class m
{
	int a=10;
	m(int x)
	{
		System.out.println(a);
	}
}
class n extends m
{
	n()
	{
	super(12);
	System.out.println("n="+a);
	}
}
class o
{
	public static void main(String z[])
	{
		n n1=new n();
	}
}