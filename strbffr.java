import java.lang.StringBuffer;
class ob
{
	public static void main(String z[])
		{
			StringBuffer sb=new StringBuffer("Hello");
			System.out.println(sb.append(" Welcome"));
			System.out.println(sb.append(" "+10));
			System.out.println(sb.capacity());		
			System.out.println(sb.charAt(4));
		}
}	