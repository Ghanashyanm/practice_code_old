interface abc
{
	int a=12;
	void s();
	void s1();
}
interface def 
{
	int c=21;
	void s2();
}
interface shivang extends abc,def
{
	int b=23;
	void s3();
}
class ia implements shivang
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
		System.out.println(a);
	}
	
	public void s3()
	{
		System.out.println(a);
	}
}
class ib implements shivang
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
		System.out.println(a);
	}
	public void s3()
	{
		System.out.println(b);
	}
}
class c
{ 
	public static void main(String z[])
	{
		ia a1=new ia();
		a1.s();
		a1.s1();
		a1.s2();
		a1.s3();
		
		shivang b1=new ia();
		b1.s1();
		b1.s();
		b1.s2();
		b1.s3();
	}
}