package strings;

public class Rotateonechar4 {

	static String rotateonechar(String str,int d)
	{
		String rotate= str.substring(d)+str.substring(0, d);
		return rotate;
	}
	static String rigthrotate(String str,int d)
	{
		return rotateonechar(str,str.length()-d);
		
		
	}
	public static void main(String[] args) 
	{
		String str1 = "Mangalagowri";
		System.out.println(rotateonechar(str1,1));
		
		String str2= "Mangalagowri";
		System.out.println(rigthrotate(str2,1));
		
	}

}
