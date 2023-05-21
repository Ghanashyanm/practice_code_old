class O2
{
	int i=20;
	void s()
	{
		System.out.println(i);
	}
}	
class A
{
	public static void main(String[]args)
	{
		O2 a=new O2();
		a.i=10;
		a.s();
	}
}	