class A5 extends Thread
{
	A5()
	{
		start();
	}
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("i="+i);
			try{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class thread5
{
	public static void main(String z[])throws Exception
	{
		A5 a = new A5();
		
		for(int j=1; j<=10;j++)
		{
			System.out.println("j="+j);
			Thread.sleep(496);
		}
		a.join();
			System.out.println("Finish");
	}
}