class abc
{
	int x=10;
	void s()
	{
		int x=10;
		System.out.println(x);
	}
	
	int s(int x)
	{
		x=20;
		System.out.println(x);
		 return 0;
	}
	
	void s(int x,int y)
	{
		x=22;y=44;
		System.out.println(x+y);
	}
}

class mno
{
	public static void main(String z[])
	{
	abc a=new abc();
	a.s();
	a.s(2);
	a.s(1,2);
	}
}