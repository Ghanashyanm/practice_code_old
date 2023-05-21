class A
{
	int i=90;
	void s()
	{
		i=98;
		System.out.println(i);
	}
}	
class B
{
	public static void main(String z[])
	{
		A b=new A();
		b.i=10;
		b.s();
	}
}