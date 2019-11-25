package strings;

public class All_permutations_of_a_string_23 
{
	public static String swapString(String a,int i,int j)
	{
		char[] b= a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]= ch;
		return String.valueOf(b);
	}
	public static void main(String[] args) 
	{
		String str="ABC";
		int len=str.length();
		System.out.println("All the permutations of the given String are : ");
		generatepermutation(str,0,len);
		

	}
	public static void generatepermutation(String str,int start,int end)
	{
		if(start==end-1)
		System.out.println(str);
		else
		{
			for(int i=start;i<end;i++)
			{
				str=swapString(str,start,i);
				generatepermutation(str,start+1,end);
				str=swapString(str,start,i);
				
			}
		}
	
		
	}

}
