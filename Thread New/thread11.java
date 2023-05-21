class A11 implements Runnable
{
	Thread t1 = new Thread(this);
	A11()
	{
		t1.start();
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
class thread11
{
	public static void main(String z[])throws Exception
	{
		A11 a = new A11();
		
		for(int j=1; j<=10;j++)
		{
			System.out.println("j="+j);
			Thread.sleep(496);
		}
		a.t1.join();
		System.out.println("Finish");
	}
}