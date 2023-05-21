interface a1 
{
	int a=10;
	void s();
	void s1();
}
interface a2
{
		int b=20;
		void s2();
		void s3();		
}
class aa implements a1,a2
{
	public void s()
	{
		System.out.println(a);
	}
	public void s1()
	{
		System.out.println(a);
	}
	public void s2()
	{
		System.out.println(b);
	}
	public void s3()
	{
		System.out.println(b);
	}
	
}
class intr
{
	public static void main(String z[])
	{
		aa m=new aa();
		m.s();
		m.s1();
		m.s2();
		m.s3();
	}
}