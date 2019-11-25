package strings;

public class Duplicatewordscount7 {

	public static void main(String[] args) 
	{
		String str = "Am an employee of Test Yantra as Test Engineer west";
		String[] words= str.split(" ");
		int count = 1;
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
				
			{
				if(words[i].equals(words[j]))
				{
					
				
				count = count + 1;
				words[j]="0";
				}
			}
			
			if(words[i]!="0")
				System.out.println(words[i]+ "---" + count);
			count=1;
		}
		
	}

}
