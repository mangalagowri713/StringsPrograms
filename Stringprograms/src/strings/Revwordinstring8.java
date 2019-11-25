package strings;

public class Revwordinstring8 {

	public static void main(String[] args)
	{
		String str = "I Love BANGALORE";
		String[] s = str.split(" ");
		String rev= "";
		System.out.println("String before Reverse is : " + str);
		for(int i=s.length-1;i>=0;i--)
		{
			rev= rev + s[i]+ " ";
		}
		System.out.println("Reversed the string in word wise : " + rev);
	}

}
