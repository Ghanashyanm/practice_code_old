interface ab
{	int a=2;
	void s();
}
interface bc 
{
	void s1();
}
interface cd extends ab,bc
{
	void s2();
}
class pq implements cd
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
}
class intrinh
{
	public static void main(String z[])
	{
		cd m=new pq();
		m.s();
		m.s1();
		m.s2();
	}
}
	