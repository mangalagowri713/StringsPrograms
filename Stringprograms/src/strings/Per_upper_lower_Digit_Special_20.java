package strings;

public class Per_upper_lower_Digit_Special_20 {

	public static void main(String[] args) 
	{
		String str = "Hi AM Going to MY hometown@ 52^";
		char[] ch = str.toCharArray();
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		
		int totalchar=str.length();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				upper++;
			}
			else
				if(Character.isLowerCase(ch[i]))
				{
					lower++;
				}
				else
					if(Character.isDigit(ch[i]))
					{
						digit++;
					}
					else
					{
						special++;
					}
		}
		System.out.println("Total length of the string : " + totalchar);
		System.out.println("upper case : " + upper );
		System.out.println("Percentage of uppercase letter : " + (upper*100)/totalchar);
		System.out.println("lower case : " + lower);
		System.out.println("percentage of lowercase letter : " + (lower*100)/totalchar);
		System.out.println("Digit : " + digit);
		System.out.println("percentage of Digit : " + (digit*100)/totalchar);
		System.out.println("Special : " + special);
		System.out.println("percentage of special : " + (special*100)/totalchar);

	}

}
