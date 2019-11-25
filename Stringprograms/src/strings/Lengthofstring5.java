package strings;

public class Lengthofstring5 {

	public static void main(String[] args) 
	{
		String s1 = "My name is Mangala Gowri";
		
		int count = 0;
		for(char ch : s1.toCharArray())
		{
			count++;
		}
		System.out.println("Length of the given String is : " + count);
	}

}
