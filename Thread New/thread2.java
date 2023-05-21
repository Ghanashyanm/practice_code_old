class A2 extends Thread
{
	A2()
	{
		start();
	}
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("i="+i);
			try{
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class x2
{
	public static void main(String z[])
	{
		A2 a = new A2();
		
		for(int j=1; j<=10;j++)
		{
			System.out.println("j="+j);
			try{
			Thread.sleep(1000);
			}
			catch(Exception f)
			{
				System.out.println(f);
			}
		}
	}
}