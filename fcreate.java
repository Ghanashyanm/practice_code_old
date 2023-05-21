import java.io.*;
class fcreate
{
	public static void main(String z[])throws IOException
	{
		FileWriter f=new FileWriter("g.txt",true);
		BufferedWriter b=new BufferedWriter(f);
	}
}