package pckg;
	public class abc 
	{
		int a=3;
		public void s()
		{
			
			System.out.println(a);
		}
	}
	interface i
	{
		int c=5;
		void s6();
	}
	class mno implements i
	{
		public void s6()
		{
			int c=5;
			System.out.println(c);
		}
	}
	class def
	{
		public static void main(String z[])
		{
			abc t=new abc();
			t.s();
			mno o=new mno();
			o.s6();
		}
	}	
		