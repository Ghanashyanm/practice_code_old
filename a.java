class a
{
	public static void main(String z[]){
		String s1=new String("Hello World");
		
		char ch=s1.charAt(6);
		System.out.println("charAt() method can="+ch);
		
		int i=s1.length();
		System.out.println("length of s1="+i);
		
		String s2=new String("Namste");
		String s3=s1.concat(s2);
		System.out.println("concat of s1 and s2 is="+s3);
		
		String s4="a-b-c-d";
		String s5[]=s4.split("-");
		
		for(i=0;i<s5.length;i++)
		{
		System.out.println("split="+s5[i]);
		}
		
		
		String s6=new String("Lion");
		
		
	}
}