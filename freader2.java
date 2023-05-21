import java.io.*;
class freader2
{
	
	static int count=0;
	
public static void main(String z[])throws Exception
{
	FileReader f=new FileReader("fread2.txt");
	BufferedReader b=new BufferedReader(f);
	String s;

while((s=b.readLine())!=null)
{
	String words[]=s.split(" ");
	count=count+words.length;
}

System.out.println(count);
}
}