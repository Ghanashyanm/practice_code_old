package f;
import e.*;

class prot2 extends prot1
{
		int b=20;
		void s2()	
		{
			System.out.println(b);
			s1();
		}
}
class w
 {
	 
	public static void main(String z[]) 
	{
		prot2 p12=new prot2();
		p12.s2();
		
	}
 }