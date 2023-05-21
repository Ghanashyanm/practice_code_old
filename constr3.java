class C3
{
	int a=10;
	C3(int y)
	{
		System.out.println("c3+"+a);
	}
}
class C4 extends C3
{
	C4()
	{
		super(23);
		System.out.println("c4="+a);
	}
}
class constr3
{
	public static void main(String z[])
	{
		C4 c=new C4();
	}
}