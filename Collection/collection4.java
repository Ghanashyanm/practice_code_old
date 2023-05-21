import java.util.*;
class collection4
{
	public static void main(String z [])
	{
		Set s=new HashSet();
		
		s.add("123");
		s.add('s');
		s.add(23);
		s.add(32);
		s.add(32);
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}