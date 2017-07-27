package StockMarket;

import StockMarket.Utility;

public class StockMarket 
{
	   public static void main(String args[])
		{
			//get stock details read stock details from fie.txt and display reports.s
			System.out.println(new Utility().getStockDetails("/home/bridgeit/Desktop/Harshil/file.txt"));
			String stockList="";
			System.out.println(""+stockList);
		}
	

}
