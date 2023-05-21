class A10 implements Runnable
{
	int time = 0;
	String n = "";
	
	Thread t1 = new Thread(this);
	A10(int i,String name)
	{
		n = name;
		time = i;
		t1.start();
	}
	
	public void run()
	{
		try{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+i);
			Thread.sleep(time);
		}
			}
		catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
class thread10 
{
	public static void main(String z[])
	{
		A10 a1 = new A10(1000,"T-1 ");
		
		A10 a2 = new A10(500,"T-2 ");
	}
}