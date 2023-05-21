class A3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+"  "+i);
		}
	}
}
class thread3
{
	public static void main(String z[])
	{
		A3 a1 = new A3();
		A3 a2 = new A3();
		A3 a3 = new A3();

		a1.start();		
		a2.start();
		a3.start();
		
	}
}