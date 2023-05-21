import java.util.*;
class collection5
{
	public String toString()
	{
		return "hello";
	}
	
	public static void main(String z[])
	{
		Map mp=new HashMap();
		mp.put("abc",123);
		mp.put("def","xyz");
		mp.put("ghi",456);
		
		System.out.println(mp);
		collection5 c=new collection5();
		System.out.println(c);
		
		// string s=mp.keyset();
		// mp.get(s);	
		// for(int i=1;i<=mp.size();i++)
		// {
		// system.out.println(mp.get(i));	
		// }
	}
}