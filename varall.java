class ghi
{
	int a=50;
	void s()
 {
	 System.out.println(a);
 }
}
class hij extends ghi
{
	int a;
	void s1()
	{
		System.out.println(a);
	}
}

class ijk
{
	public static void main (String z[])
	{
		ghi g=new ghi();
		g.a=10;
		g.s();
		hij h=new hij();
		
		h.s();
		h.s1();
	}
}