package strings;

import java.util.HashMap;
import java.util.Scanner;

public class First_repeated_and_non_repeated_char_24 
{
	static void firstrepeatedandnonrepeatedchar(String str)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
		if(charCountMap.containsKey(c))
		{
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else
		{
			charCountMap.put(c, 1);
		}

		
	}
	//checking for first non-repeated character
	
	for(char c : ch)
	{
		if(charCountMap.get(c)==1)
		{
			System.out.println("First non-repeated character in " + str + " is : " + c  );
			break;
		}
	}
	
	// checking for first repeated character
	
	for(char c : ch)
	{
		if(charCountMap.get(c)>1)
		{
			System.out.println("First repeated character in " + str + " is : " + c  );
			break;
		}
	}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.next();
		firstrepeatedandnonrepeatedchar(input);
	}

}

