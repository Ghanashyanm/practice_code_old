class abc
{
	 int a=10,b=20;
	 void s()
	 {
		int a=15,b=25;
		int c=a+b;
		System.out.println(c);
	 }
	 void s1()
	 {
		 int a=15,b=25;
		 int c=a*b;
		 System.out.println(c);
	 }
}
class bcd
{
 public static void main(String z[])
 {
  abc a1=new abc();
  a1.a=1;
  a1.b=1;
  a1.s();
  a1.s1();
  a1.s();
 }
}