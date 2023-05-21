class am
{
	private void s1()
	{
		int a = 20;
		System.out.println(a);
	}
	void s3(){
	s1();
	}
}
	class abc extends am
	{
		void s2(){
		int b = 30;
		System.out.println(b);
		}
	}
class am_main{
	public static void main(String z[])
	{
			am a1 = new am();
			a1.s3();
			a1.s1();
			abc a2 = new abc();
			a2.s3();
	}
}