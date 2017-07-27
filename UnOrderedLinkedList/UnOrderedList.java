package UnOrderedLinkedList;

import UnOrderedLinkedList.Node;
import UnOrderedLinkedList.Utility;

public class UnOrderedList
{
	static Node start;
	Utility  u1=new Utility();
	ListUtility lu=new ListUtility();

	public UnOrderedList()
	{
		try
		{
			start=lu.readFile(start);
			System.out.print("Enter the word to search :");
			String word1=u1.inputString();
			//Search the word
			start=lu.searchData(start,word1);
			String word2=" ";

			while(start!=null)
			{
				word2=word2+start.data;
				word2=word2+" ";
				start=start.nextNode;
			}
			//  u1.writeToFile(start);
			lu.writeDataToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		//End of method

	public static void main(String[] args)
	{
		UnOrderedList ul=new UnOrderedList();
	}
}