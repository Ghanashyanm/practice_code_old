import java.util.*;
class collection6
{
	public static void main(String z[])
	{
		Map mp=new HashMap();
		mp.put("abc",123);
		mp.put("def","xyz");
		mp.put("ghi",456);
		
		Set s=mp.keySet();
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			String s1 = (String) i.next();
			System.out.println( s1 + " = " + mp.get(s1));	
		}
	}
}