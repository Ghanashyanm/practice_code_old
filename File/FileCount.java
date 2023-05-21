import java.io.*;
import java.util.*;
class w2
{
	 public static void main(String z[]) throws IOException{
		 
		FileReader fr = new FileReader("WordCount.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		int count1 = 0;
		int a=0;
		int b=0;
		Map mp = new HashMap();
		while((str=br.readLine()) != null)
		{
			String words[] = str.split(" ");
			for(int i=0;i<words.length;i++)
			{
				if(!words[i].trim().isEmpty())
				{
				 Integer j = (Integer)mp.get(words[i]);
				 if(j==null)
				 {
					 mp.put(words[i],1);
				 }
				 else
				 {
					 j++;
					 mp.put(words[i],j);
				 }
				}
			}//count1 = count1 + words.length;
		}
		//System.out.println(count1);
		Set s=mp.keySet();
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			String s1 = (String) i.next();
			System.out.println(  s1 +" = "  + mp.get(s1));	
		}		
		
	 }
}