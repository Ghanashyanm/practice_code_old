class A9 implements Runnable
{
	Thread t1 = new Thread(this);
	Thread t2 = new Thread(this);
	Thread t3 = new Thread(this);
	
	A9()
	{
		t1.start();		
		t2.start();
		t3.start();
	}
		
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+"  "+i);
		}
	}
}
class thread9
{
	public static void main(String z[])
	{
		A9 a1 = new A9();
	}
}