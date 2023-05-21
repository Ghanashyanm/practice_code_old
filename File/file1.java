import java.io.*;
class Bcd{
	
	public static void main(String z[]){
		try{
		File f = new File("f1.txt");
		f.createNewFile();
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.isHidden());
		System.out.println(f.delete());
		}
		catch(Exception e){
			System.out.println("Error"+e);
		}
	}	
}