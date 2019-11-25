package strings;

import java.util.Scanner;

public class To_Remove_Whitespace_12 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = sc.nextLine();
		String stringwithoutspaces=inputString.replaceAll("\\s+","" );
		System.out.println("Input String : " + inputString);
		System.out.println("Input String with out Space : " + stringwithoutspaces);
		sc.close();
	

	}

}
