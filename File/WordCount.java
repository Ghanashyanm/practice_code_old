import java.io.*;
import java.util.*;
 class w1{
	 public static void main(String z[]) throws IOException{
		 
		
		FileWriter fw = new FileWriter("WordCount.txt");
		BufferedWriter bf =  new BufferedWriter(fw);
		bf.newLine();
		bf.write("This is my laptop.");
		bf.close();
		
		FileReader fr = new FileReader("WordCount.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		int count1 = 0;
		while((str=br.readLine()) !=null)
		{
			
			String words[] = str.split(" ");
			count1 = count1 + words.length;
		}
		System.out.println(count1);
	 }
}