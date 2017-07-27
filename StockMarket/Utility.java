package StockMarket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import StockMarket.Stock;
import java.util.ArrayList;
import bridgrLabs.JavaPrograms.SortingFunction;
import java.io.File;
import java.io.FileWriter;

public class Utility
{
	BufferedReader br;

	
	//constructor to initialize bufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}


	//Read the file  and take stock details as input and return array-list of stock details
	public ArrayList<Stock> getStockDetails(String fileName){
		ArrayList<Stock> stockList=new ArrayList<Stock>();
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			SortingFunction sortingFunction=new SortingFunction();
			while(line!=null){
				String words[]=sortingFunction.wordsArrayFromStatement(line);
				try{
					stockList.add(new Stock(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2])));
				}
				catch(NumberFormatException nfe){
				}
				catch(ArrayIndexOutOfBoundsException ae){
				}
				line=br.readLine();
			}
			return stockList;
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}	

	//Take file name as input and return string of file text
	public String getFileText(String fileName){
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}
}