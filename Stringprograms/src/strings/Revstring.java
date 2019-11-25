package strings;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) 
	{
		String i,rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse a number : ");
		i=sc.nextLine();
		int length = i.length();
		for(int j=length-1;j>=0;j--)
			rev=rev + i.charAt(j);
		System.out.println("reversed String is : " + rev);
			

	}

}
