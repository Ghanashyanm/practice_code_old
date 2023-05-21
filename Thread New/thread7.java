class A7 implements Runnable
{
	Thread t1 = new Thread(this);
	A7()
	{
		t1.start();
	}
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("i="+i);
		}
	}
}
class thread7
{
	public static void main(String z[])
	{
		A7 a = new A7();
		
		
		for(int j=1; j<=10;j++)
		{
			System.out.println("j="+j);
		}
	}
}