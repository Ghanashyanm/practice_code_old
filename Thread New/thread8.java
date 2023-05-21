class A8 implements Runnable
{
	Thread t1 = new Thread(this);
	A8()
	{
		t1.start();
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
class thread8
{
	public static void main(String z[])
	{
		A8 a = new A8();
		
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