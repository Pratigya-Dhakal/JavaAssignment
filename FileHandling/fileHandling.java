import java.io.*;
class fileHandling{
	public static void main(String[] args) throws Exception {
		int count=0;
		File f=new File("c:\\GCES");
		String[]s=f.list();
		for(String s1:s){
			count ++;
			System.out.println("s1");
			System.out.println("Totalno:"+count);
		}
	}
}
