class T6 implements Runnable
{
	Thread t1 = new Thread(this);
	Thread t2 = new Thread(this);
	T6()
	{
		t1.start();
		t2.start();
	}
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class thread6
{
	public static void main(String z[])
	{
		T6 t = new T6();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}