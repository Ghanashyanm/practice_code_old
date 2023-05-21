class eh2
{
	public static void main(String z[]){
	try{
	if(z[0]=="user" && z[1]=="pwd")
	{
		System.out.println("Welcome");		
	}
	else
	{
		System.out.println("e");
	}
	}
	catch(Exception m)
	{
		System.out.println("Error"+m);
		throw(m);
	}
	}
}