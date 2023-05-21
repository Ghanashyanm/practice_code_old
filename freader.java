import java.io.*;
class freader
{
	public static void main(String z[])throws IOException
	{
		FileReader f=new FileReader("fread.txt");
		BufferedReader b=new BufferedReader(f);
		
		int c=0;
		String s;
		
			while((s=b.readLine())!=null)
			{			
				System.out.println(s);
				c++;
			}
				System.out.println(c);
	}
}