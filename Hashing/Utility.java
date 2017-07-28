package Hashing;
/*
* Created by: BridgeLabz
* Date: 26/07/2017
* Purpose: Putting Commonly used function in single file.
	1 function to take word,integer and double as input
	2: function to read and write file.
	3 function to match regex from string and replace with user details	 
**/
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Utility
{
	BufferedReader br;
	
	
	//constructor to initialize bufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	
	//take input word
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		try{
			try{	
				return Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	//Take Double Input
	public double inputDouble(){
		try{
			try{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0.0;
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