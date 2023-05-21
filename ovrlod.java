class ovrlod
{
	void s()
	{
	int i=1;
	System.out.println(i);
	}
 
	void s(int a)
	{
		
		System.out.println(a);
	
	}
	
	void s(int b,int c)
	{
		int demo=b+c;
		System.out.println(demo);
		
	}
}
class demo
{
	public static void main(String z[])
	{
		ovrlod g=new ovrlod();
		g.s();
		g.s(4);
		g.s(3,5);
	}
}