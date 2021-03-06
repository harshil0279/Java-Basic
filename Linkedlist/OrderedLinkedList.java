package Linkedlist;


public class OrderedLinkedList {

	IntegerNode p = null;	
	int count = 0;
	
	
	public static void main(String[] args) {
		int[] test = { 55, 22, 13, 34, 18};
		OrderedLinkedList ol = new OrderedLinkedList();
		for (int i = 0; i < test.length; i++) {
			ol.append(test[i]);
		}
		
		ol.display();
	}
	
	
	void append(int value)
	{		
		IntegerNode q;
		IntegerNode next;
		
		IntegerNode temp = new IntegerNode();
		temp.data = value;
		temp.link = null;
		
		
		// the list is empty
		if(p == null)
		{
			System.out.println("Creating the list");
			p = temp;						
		}
		
		else
			
			// if the given value is less than the first value
			if(value <= p.data)
			{
				
				System.out.println("Less than first value");
				temp.link = p;
				p = temp;
			}
		
		else
		{
			boolean ins = false;
			q = p;
            next = p.link;
            while(next != null && ins == false)
            {
                if (value > q.data && value < next.data)
                {
                    q.link =temp;
                    temp.link=next;
                    ins = true;                    
                }
                else
                {
                    q = next;
                    next = next.link;
                }
            }
            if (ins == false)
            {
                q.link = temp;
            }
		}
		
		count++;
		
	}
	
	
	void display()
	{
		IntegerNode q;
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
	
	
	void insert(int value)
	{						
		
		IntegerNode q, old;
		boolean found = false;
		
		q=p;
		old = p;

		if(q!= null)
		{
			
			while(q!= null)
			{
								
				if(q.data == value)
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
	
	public int[] toIntegerArray() throws RuntimeException
	{
		if(count == 0)
		{
			throw new RuntimeException("List is empty");
		}
		
		else
			
		{
			System.out.println(count);
			int[] words = new int[count];
			IntegerNode q=p;
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