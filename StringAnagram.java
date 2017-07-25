import java.util.Scanner;
import java.lang.*;
public class StringAnagram
{
	public static void main(String[] anagram)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  string1");
		String str1  = sc.nextLine();
		System.out.println("Enter a string2");
		String str2 = sc.nextLine();
		System.out.println(anagramCheck(str1,str2));
	}



       public static boolean anagramCheck(String str1,String str2)
	{
		char[] charString1 = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for(char c : charString1)
		{
			int index = sb.indexOf(String.valueOf(c));
			if(index != -1)
			{
				sb.deleteCharAt(index);
			}
			else
			{
				return false;
			}
		}
		return sb.length() ==  0;
	}
}
