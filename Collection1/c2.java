import java.util.*;
class c2
{
	
	public static void main(String z[])
	
	{
	
	Set s = new HashSet();
	
	s.add("10");
	s.add(10);
	s.add(32);
	s.add(10);
	s.add("Abc");
	
	Iterator i = s.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
}