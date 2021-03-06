package Linkedlist;


public class UnorderedLinkedList {

	StringNode p = null;	
	int count = 0;
	
	void append(String value)
	{		
		StringNode q;
		
		StringNode temp = new StringNode();
		temp.data = value;
		temp.link = null;
		
		if(p == null)
		{
			System.out.println("Creating the list");
			p = temp;
			System.out.println("Node added successfully");
			count++;
		}
		
		else
		{
			q = p;
			
			while(q.link!= null)
			{
				q = q.link;
			}
			
			q.link = temp;
			count++;
			
			
		}
		
	}
	
	
	void display()
	{
		StringNode q;
		q = p;
		
		if(q == null)
		{
			System.out.println("List is empty");
		}
		
		else
			
			while(q!= null)
			{
				System.out.print(q.data+" ");
				q = q.link;
			}
		System.out.println();
	}
	
	
	void insert(String value)
	{						
		
		StringNode q, old;
		boolean found = false;
		
		q=p;
		old = p;
				
//					
//		if(q== null)
//		{		 
//		 append(value);
//		}
		if(q!= null)
		{
			
			while(q!= null)
			{
								
				if(q.data.equals(value))
				{
					if(q == p)
					{
						q = q.link;
						found = true;
					}
					else
					{
					old.link = q.link;
					found = true;
					q = null;
					}
					System.out.println("Value found and deleted");
					count--;
				}
				
				else
				{					
					old = q;
					q=q.link;
				}
			} // end while
		}
			
			if(found == false)					
			{
				System.out.println("Trying to append");
				
				append(value);
			}
					
		
	}
	
	public String[] toWordArray() throws RuntimeException
	{
		if(count == 0)
		{
			throw new RuntimeException("List is empty");
		}
		
		else
			
		{
			String[] words = new String[count];
			StringNode q=p;
			int i = 0;
			while(q!= null)
			{
				words[i] = q.data;
				q = q.link;
				i++;
			}
			
			return words;
		}
			
	}

}