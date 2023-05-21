class T13 extends Thread
{
	synchronized void s1()
	{
		System.out.println("Hii");
		try
		{
			Thread.sleep(500);
			System.out.println("Bye");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class T131 implements Runnable
{
	Thread t = new Thread(this);
	T13 a1;
	T131(T13 a)
	{
		a1=a;
		t.start();
	}
	public void run()
	{
		a1.s1();
	}
}
class thread13
{
	public static void main(String z[])throws Exception
	{
		T13 a1 = new T13();
		T131 x = new T131(a1);
		T131 x1 = new T131(a1);
		T131 x2 = new T131(a1);
		T131 x3 = new T131(a1);
	}
}