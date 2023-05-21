import java.io.*;
class bffr1
{
	public static void main(String z[])throws IOException
	{
		FileWriter f=new FileWriter("newbffr.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		b.write("abc");
		b.newLine();
		b.write("123");
		b.newLine();
		b.write("a1b1");
		b.newLine();
		b.append("Hello EveryOne");
		b.close();
	}
}