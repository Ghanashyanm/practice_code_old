import java.io.*;
class bffr2
{
	public static void main(String z[])throws IOException
	{
		FileWriter f=new FileWriter("newbffr.txt",true);
		BufferedWriter b=new BufferedWriter(f);
	
		InputStreamReader i1=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i1);
		
		System.out.println("First Name:");
		String s1=br.readLine();
		System.out.println("Last Name:");
		String s2=br.readLine();
		b.write(s1);
		b.newLine();
		b.write(s2);
		b.close();
	}
}
