class abc 
{ 
 void s()
	{
		int a=10;
		System.out.println(a);
	}
}
class xyz extends abc
{
	 void s1()
	 {
		int b=20;
		System.out.println(b);
	 }
}
class def extends xyz
{
	void s2()
	{
		int c=30;
		System.out.println(c);
	}
}
class pqr extends xyz
{
	void s3()
	{
		int m=2;
		System.out.println(m);
	}
}
class mno
{
	public static void main(String z[])
	{
	abc a1=new abc();
	a1.s();
	xyz x=new xyz();
	
	x.s();
	def d=new def();
	
	d.s();
	
	pqr p=new pqr();
	p.s1();
	}
}