import java.util.*;
class Abc{
	public static void main(String z[]){
		Random r = new Random();
		int i = r.nextInt(50);
		System.out.println(i);
		if(i%2==0)
		{
			System.out.println("numner is even");
		}
		else
		{
			System.out.println("numner is odd");
		}
	}	
}