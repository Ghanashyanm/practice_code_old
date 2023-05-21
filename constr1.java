class constr
{
		constr(int x)
		{			
			System.out.println(x);
		}
		constr()
		{
			int a=4;
			System.out.println(a);
		}
		constr(int x,int y)
		{
			int b=x+y;
			System.out.println(b);
		}
}
class constr1
{
	public static void main(String z[])
	{
		constr a1=new constr(5);
		constr a2=new constr();
		constr a3=new constr(2,3);
	}
}