 class acc2{
	private int a;
	 void s1(){
		System.out.println(a);
	}
}
class acc3 extends acc2{
	
}

class am_main2{
	
	public static void main (String z[])
	{
		acc2 a1 =new acc2();
		a1.s1();
		acc3 a2 = new acc3();
		a2.s1();
		//a1.a=10;
	}
}