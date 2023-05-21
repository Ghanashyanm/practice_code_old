import java.io.*;
class F1{
	public static void main(String z[]){
		try{
		File f = new File("2.txt");
		File f1 = new File("3.txt");
		
		//System.out.println("mkdir : "+f.mkdir());
		//System.out.println("mkdirs : "+f.mkdirs());
		//System.out.println("lastmodified : "+f.lastModified());
		System.out.println("reanmeTo : "+f.renameTo(f1));
		
		
		}
		catch(Exception e){
			System.out.println("Error : "+e);
		}
	}


}