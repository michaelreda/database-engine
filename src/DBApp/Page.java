package DBApp;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import DBApp.Page;
import pagingConfiguration.configuration;
import DBApp.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Page {
	
	public  String [][] data;
	boolean [] deleted;
	int current;
	
	//First Step: Constructing a page - You should initialize the variables given above -
	public Page(int noCol)
	{
		data = new String[configuration.pageSize][noCol];
		deleted = new boolean[configuration.pageSize];
		current = 0;
	}
	
	//Function1: A function that checks if the page is full
	public boolean isFull()
	{
		if(current==200)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	//Function2: Inserting a record into the page
	public boolean insert(String [] val)throws FileNotFoundException
	{
		
	        
	        
			if(val.length== data[current].length)
			{
	        for(int i=0; i<val.length;i++)
	        {
	        	data[current][i]=val[i];
	                
	        }
	        current++;
    		return true;
			}
	        return false;
	}
	
	//Function3: Inserting a set of records into a page - It will use Function2-
//	public Page getData(int [] colNum)
//	{
//		
//		if(this.isFull())
//		{
//			return this;
//		}
//		
//		
//		return this;
//	}
	
	
//	private String[][] loadCSV(String filePath) {
//		ArrayList<String[]> lines = new ArrayList<>();
//
//		BufferedReader reader = null;
//		String line = null;
//		try {
//			reader = new BufferedReader(new FileReader(filePath));
//			while ((line = reader.readLine()) != null) {
//				lines.add(line.split(","));
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (reader != null) {
//					reader.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return lines.toArray(new String[][] {});
//	}

}
