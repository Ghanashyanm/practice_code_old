import java.util.*;
class Milan extends Exception{}
class Harsh extends Exception{}
class Abc{
	void s(){
		try{
			System.out.println("Hii");
			s1();
			System.out.println("Bye");
		}
		catch(Exception e){
			System.out.println("Error="+e);
		}
	}
	void s1(){
		Random r = new Random();
		int i = r.nextInt(50);
		System.out.println(i);
		
		if(i%2==0)
		{
			System.out.println("numner is even");
			Milan m = new Milan();
			throw(m);
		}
		else
		{
			System.out.println("numner is odd");
		}
	}
	public static void main(String z[]){
		Abc a = new Abc();
		a.s();
	}
}