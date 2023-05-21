class C1
{
	int a=10;
	C1()
	{
		System.out.println(a);
	}
	
	C1(int x)
	{
		System.out.println(x);
	}
	
	C1(int y,int z)
	{
		System.out.println(y+z);
	}
}
class constr2
{
	public static void main(String z[])
	{
		C1 d=new C1();
		C1 e=new C1(2);
		C1 f=new C1(3,4);
	}
}