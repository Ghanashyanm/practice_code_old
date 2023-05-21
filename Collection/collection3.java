import java.util.*;
class collection3
{
	public static void main(String z [])
	{
		Set s=new HashSet();
		s.add("123");
		s.add('s');
		s.add(23);
		boolean a=s.add(32);
		boolean b=s.add(32);
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
	}
}