package bridgrLabs.JavaPrograms;

import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		int N,I,PASS,EXCHS,TEMP,LAST;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements that you want in array");
		N =s.nextInt();
	    int K[] = new int[N];
		System.out.println("Enter the elements of array");
		for(I=0;I<N;I++)
		{
			K[I] = s.nextInt();
		}
		LAST = N;
		for(PASS = 0; PASS<N-1;PASS++)
		{
			EXCHS = 0;
			for(I = 0;I<LAST-1;I++)
			{
				if(K[I]>K[I+1])
				{
					TEMP = K[I];
					K[I] = K[I+1];
					K[I+1] = TEMP;
					EXCHS++;
				}
			}
			if(EXCHS == 0)
			{
				break;
			}
			else
			{
				LAST--;
			}
			for(I = 0 ;I<N;I++)
			{
				System.out.println(K[I]);
			}
		}
				
	}	
}
