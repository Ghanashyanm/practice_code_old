import java.io.*;
class file1
{
	public static void main(String z[])throws IOException
	{		
		File f=new File("aaaaaaa");
		boolean b=f.mkdir();
		
		System.out.println(b);
		File x=new File("a.txt");	
		
		System.out.println(f.getName());
		
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.exists());
		
		System.out.println(f.renameTo(x));
		
		File y=new File("33.txt");
		System.out.println(y.mkdir());
	}
}