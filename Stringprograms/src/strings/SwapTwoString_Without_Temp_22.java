package strings;

public class SwapTwoString_Without_Temp_22 {

	public static void main(String[] args)
	{
		String s1="mangala";
		String s2="gowri";
		System.out.println("Bedfore swap " + s1 + " " + s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swaping " + s1 + " " + s2);
	}

}
