class A4 extends Thread
{
	int time = 0;
	String n = "";
		
	A4(int i,String name)
	{
		n = name;
		time = i;
		start();
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
class thread4 
{
	public static void main(String z[])
	{
		A4 a1 = new A4(1000,"T-1 ");
		
		A4 a2 = new A4(500,"T-2 ");
	}
}