class gh1
{
	int a=90;
	static void s()
	{		
		System.out.println(a);
	}
}

class gh2 extends gh1{
	
	void s2()
	{
		System.out.println(a);
	}
}

class gh1m
{
	public static void main(String z[])
	{
		gh1 b1=new gh1();
		b1.s();
		gh2 b2=new gh2();
		b2.s2();
	}
}