import java.io.*;
import java.util.*;

class SearchWord{
	public static void main(String z[]) throws IOException
	{
		FileReader fr = new FileReader("WordSearch.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Enter word");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader b1 = new BufferedReader(ir);
		int a = 0;
		String str;
		int c=0;
		String str1 = b1.readLine();

		while((str=br.readLine())!=null){
	
			String[] s = str.split(" ");
			for(int j=0;j<s.length;j++){
				if(s[j].equalsIgnoreCase(str1)==true){
				c++;
				}
				System.out.println(s[j]);
			}
			for(int i=0;i<s.length;i++)
			{
				a++;
			}
			}
			System.out.println("number of words"+a);
			System.out.println("number of reapet"+c);
	}	
}