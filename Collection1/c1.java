import java.util.*;
class c1
{
	public static void main(String z[])
	{
	List ls = new ArrayList();
	ls.add(23);
	ls.add(21);
	ls.add("abc");
	ls.add(1.2);
	ls.add(1.2);
	
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	//System.out.println(ls);
	}
}