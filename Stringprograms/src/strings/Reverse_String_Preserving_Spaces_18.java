package strings;

public class Reverse_String_Preserving_Spaces_18 {

	public static void main(String[] args) 
	{
		String str="hello word";
		int length=str.length();
		char[] ch = str.toCharArray();
		for(int i=0,j=length-1;i<=j;i++,j--)
		{
			if(ch[i]==' ')
				i++;
			if(ch[j]==' ')
				j--;
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}

			System.out.println(ch);
				
	}

}
