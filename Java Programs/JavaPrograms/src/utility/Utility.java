package utility;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.IOException;

public class Utility
{
	BufferedReader br;
	
	//constructor to initialize bufferedReader
	public Utility()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//take input word
	public String inputString(){
		try
		{
			return br.readLine();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		try{
			
			try
			{	
				return Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	//Take Double Input
	public double inputDouble(){
		try
		{
			try
			{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException nfe)
			{
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}

}