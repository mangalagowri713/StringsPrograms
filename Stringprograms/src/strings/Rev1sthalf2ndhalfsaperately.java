package strings;

public class Rev1sthalf2ndhalfsaperately {

	public static void main(String[] args) 
	{
		String str = "Sagarika";
		System.out.println("Given String to reverse : " + str);
		
		char[] ch =str.toCharArray();
		for(int i=(ch.length-2)/2;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int j=ch.length-1;j>(ch.length-2)/2;j--)
		{
			System.out.print(ch[j]);
		}
	}

}
