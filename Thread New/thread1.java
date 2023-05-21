class A1 extends Thread
{
	A1()
	{
		start();
	}
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("i="+i);
		}
	}
}
class x1
{
	public static void main(String z[])
	{
		A1 a = new A1();
		
		
		for(int j=1; j<=10;j++)
		{
			System.out.println("j="+j);
		}
	}
}