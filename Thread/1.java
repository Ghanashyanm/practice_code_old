import java.lang.*;
class expthread extends Thread
{
	expthread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("abc is:"+i);
			try{
			Thread.sleep(1000);
			}
			catch(Exception c)
			{
				System.out.println(c);
			}
		}
	}
}
class mymain
{
	public static void main(String z[])
	{
		 expthread t=new expthread();
		// t.start();
		for(int j=0;j<10;j++)
		{
			System.out.println("		xyz is="+j);
			try{
			Thread.sleep(500);
			}
			catch(Exception c)
			{
				System.out.println(c);
			}
		}
	}
}