class d1
{
	int a;
	void s()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
class demo1
{
	public static void main(String z[])
	{
		d1 a1 = new d1();
		a1.a=50;
		a1.s();
		d1 a2 = new d1();
		a2.a=30;
		a2.s();
		d1 a3 = new d1();
		a3.a=20;
		a3.s();
	}
}