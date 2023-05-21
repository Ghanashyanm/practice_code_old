class def
{
	void s()
	{
		int x=1;
		System.out.println(x);
	}
}
class efg extends def
{
	void s()
	{
		int x=2;
		System.out.println(x);
		super.s();
	}
}
class bcd
{
	public static void main(String z[])
	{
		efg m=new efg();
		m.s();
		
	}
}