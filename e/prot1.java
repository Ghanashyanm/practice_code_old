package e;
public class prot1
{ 
	int a=12;
	protected void s1()
	{
		System.out.println(a);
	}
}
class prot1m
{
	public static void main(String z[])
	{
		prot1 p11=new prot1();
		p11.s1();
	}
}
