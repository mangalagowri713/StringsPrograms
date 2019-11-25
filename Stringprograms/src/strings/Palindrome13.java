package strings;

public class Palindrome13 {

	public static void main(String[] args)
	{
		String s1 = "MOM";
		System.out.println(s1);
		String s2 = "";
		char[] ch = s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s2 = s2 + ch[i]; 
		}
		if(s2.equals(s1))
		{
			System.out.println(" The Given String is palindrome :)");
		}
		else
		{
			System.out.println("The String is not Palindrome :(");
		}
	}

}
