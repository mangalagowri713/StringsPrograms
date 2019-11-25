package strings;

public class Reverse_each_word_19 {

	public static void main(String[] args) 
	{
		String str="I LOVE BANGALORE";
		String words[]= str.split("\\s");
		String revstring=" ";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revword=" ";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
				
			}
			revstring=revstring+revword+" ";
		}
		System.out.println("Reversed String : " + revstring);
	}

}
