class T12 extends Thread
{
	public void run()
	{
		try{
		for(int i=1; i<=15;i++)
		{
			System.out.println("O"+i);
		Thread.sleep(500);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class T121 extends Thread
{
	public void run()
	{
		try{
		for(int i=1; i<=15;i++)
		{
			System.out.println("t"+i);
		Thread.sleep(500);
		}
		}
		
		catch(Exception f)
		{
			System.out.println(f);
		}
	}
}
class thread12 
{
	public static void main(String z[]) throws Exception
	{
		T12 t1 = new T12();
		T121 t2 = new T121();
		
		t1.start();
		t2.start();
		
		Thread.sleep(2000);
		t1.suspend();
		Thread.sleep(3000);
		t1.resume();
		
		Thread.sleep(2000);
		t2.suspend();
		Thread.sleep(3000);
		t2.resume();
		
		
	}
}