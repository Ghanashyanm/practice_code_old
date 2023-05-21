import java.io.*;
import java.util.*;

class Action
{
	int a = 0;
	void action() throws IOException
	{
		System.out.println("Enter Action number 1.Insert 2.Search 3.Exit :");
		Scanner sc = new Scanner(System.in);
		
			if(Integer.parseInt(sc.nextLine())==1)
			{
			
				System.out.println("Enter Train Details:");
				InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);
				String td = br.readLine();
			
				FileWriter fw = new FileWriter("train.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(td);
				bw.newLine();
				bw.close();
				fw.close();
				action();
			
			}
			else
			{
				System.out.println("Exited.");
			}
			
			if(Integer.parseInt(sc.nextLine())==2)
			{
			
				System.out.println("Enter Train Name or Number :");
				FileReader fr = new FileReader("train.txt");
				BufferedReader br = new BufferedReader(fr);
			
			}
			else
			{
				System.out.println("Exited.");
			}
	}
}
class train
{
	public static void main(String z[])throws IOException
	{
		Action a1 = new Action();
		a1.action();
	}
}