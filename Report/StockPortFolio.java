package Report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockPortFolio {

	List<Stock> stockList;
	
	public StockPortFolio() throws FileNotFoundException, IOException
	{
		stockList = new ArrayList<>();
		
		
		// check the system.getProperty(user.dir) in case of errors
		try(BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Desktop/Harshil/file.txt")))
		{
			
			// read each stock line by line and add them to the arraylist
			
			String line;
			while((line = br.readLine()) != null )
			{							
				Stock stock = readStock(line);
				stockList.add(stock);
			}
			
		}
	}
	
	public Stock readStock(String s)
	{
		String[] stock = s.split(", ");
		String name = stock[0];
		double price = Double.parseDouble(stock[1]);
		int quantity = Integer.parseInt(stock[2]);
		
		return new Stock(name, quantity, price);
	}
	
	public List<Stock> getStockPortfolios()
	{		
			return stockList;
	}
	
	
}