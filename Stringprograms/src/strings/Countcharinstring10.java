package strings;

public class Countcharinstring10 {

	public static void main(String[] args) 
	{
		String str = "I like my hometown";
		char[] ch = str.toCharArray();
		int count=0;
		try {
			for(int i=0;true;i++)
			{
				char c = ch[i];
				count++;
			}
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("NO of char in the string : " + count);
	}
}
