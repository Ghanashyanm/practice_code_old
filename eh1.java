class eh1{
	void s1(){
		try{
		int s1=1;
		System.out.println("s1="+s1);
		s2();
		System.out.println("After s1="+s1);
		}
			
		catch(Exception e){
			System.out.println("Error = "+e);
			throw(e);
		}
	}
	void s2(){

		try{
		int s2=2;
		System.out.println("s2"+s2);
		s3();
		System.out.println("After s2="+s2);
		
		}
		
		catch(Exception f){
			System.out.println("Error = "+f);
			throw(f);
			
		}
	}
	void s3(){
		
		try{
		int s3=1/0;
		System.out.println("s3="+s3);
		}
		
		catch(Exception g){
		System.out.println("Error = "+g);
		throw(g);
		}
	}
	
}
class m{
	public static void main(String z[])
	{
		eh1 e1 = new eh1();
		e1.s1();
	}
}