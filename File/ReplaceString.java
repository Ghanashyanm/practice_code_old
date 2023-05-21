import java.io.*;
import java.util.*;

class ReplaceString{
	public static void main(String z[]) throws IOException
	{
		FileWriter fw = new FileWriter("ReplaceString.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.newLine();
		bw.write("How are You?");
		bw.newLine();
		bw.write("Milan");
		bw.newLine();
		bw.write("Hemang");
		bw.newLine();
		bw.write("Ghaanshyam");
		bw.close();
		
		System.out.println("Enter String :");
		InputStreamReader ir1 = new InputStreamReader(System.in);
		BufferedReader b1 = new BufferedReader(ir1);
		String str = b1.readLine();
		
		FileReader fr = new FileReader("ReplaceString.txt");
		BufferedReader br = new BufferedReader(fr);
		String str1;
		FileWriter f = new FileWriter("ReplaceString2.txt");
		BufferedWriter bw1 = new BufferedWriter(f);
		
		while((str1 = br.readLine())!=null)
		{
			String s = str1.replaceAll("Milan",str);
			bw1.write(s);
			bw1.newLine();
		}
		
		bw1.close();
		b1.close();
		br.close();
		File f1 = new File("ReplaceString2.txt");
		File f2 = new File("ReplaceString.txt");
		
		f2.delete();
		f1.renameTo(f2);
	}
}