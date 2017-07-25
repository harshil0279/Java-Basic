import java.util.*;
 
public class Program2
{
    public static void main(String [] args)
    {
        //declare variables
       double flip;
        int count = 0;
        int countHeads = 0;
        int countTails = 0;
        int percentHeads = 0;
        int percentTails = 0;
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt(); 
          //Loop
        for(int x = 0; x <=n;x = x++)
        {
            x = x + 1;
           //flip
           flip = Math.random();
            //if statement
           if( flip <= .5)
            {   
                flip = countHeads;
                countHeads = countHeads + 1;
                percentHeads = countHeads * 10;
                }
            else
            {           
                flip = countTails;
              countTails = countTails + 1;
                percentTails = countTails * 10;
                System.out.println("Heads was flipped " + percentHeads + " percent of the time.");
                System.out.println("Tails was flipped " + percentTails + " percent of the time.");
 
            
            }
            
            count = count +1;
             
                         
                     
        }//End Loop
         
         
}//End Main
}//End Class


