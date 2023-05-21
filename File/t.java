import java.io.*;
import java.util.*;
class tr1
{
	int a=0;
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	void train() throws IOException
	{
		while(a!=3)
		{
			System.out.println("Enter Action number 1.Insert 2.Search 3.Exit :");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			if(a==1 || a==2)
			{
				switch(a)
				{
					case 1:	
							System.out.println("Enter Train Details :");
							insert();
							break;
					case 2: 
							search();
							break;
				}		
			}
		}
	}
	void insert() throws IOException
	{
		System.out.println("Enter Train Details:");
				InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);
				String td = br.readLine();
			
				FileWriter fw = new FileWriter("t1.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(td);
				bw.newLine();
				bw.close();
	}
	void search() throws IOException
	{
		FileReader fr = new FileReader("t1.txt");
		BufferedReader br1 = new BufferedReader(fr);
		String str;
		System.out.println("Search train by name or number or source or destination");
		String str1 = br1.readLine();
		
		while((str=br1.readLine())!=null)
		{
			String[] s = str.split(" ");
			for(int k=0;k<s.length;k++)
			{
				boolean b = str1.equalsIgnoreCase(s[k]);
				if(b==true)
				{
					System.out.println("Result :"+str);
				}
			}
		}
			br1.close();
	}
}
class t
{
	public static void main(String z[])throws IOException
	{
		tr1 o = new tr1();
		o.train();
	}
}