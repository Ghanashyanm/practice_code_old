import java.util.*;
class c3
{
	public static void main(String z[])
	{
	
	Map mp = new HashMap();
	
	mp.put("a",123);
	mp.put("b","Abc");
	mp.put("c",10.2);
	mp.put("a",456);
	mp.put("a",798);
	
	//System.out.println(mp);
	//System.out.println(mp.get("a"));
	
		Set s=mp.keySet();
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			String s1 = (String) i.next();
			System.out.println( "\"" + s1+ "\"" + " = "  + mp.get(s1));	
		}		
	}
}