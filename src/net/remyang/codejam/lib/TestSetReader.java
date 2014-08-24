package net.remyang.codejam.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestSetReader {
	
	public static TestSet read(String inputFile)
	{
		
        TestSet testSet = new TestSet(); 
        try
        {
        	BufferedReader in = new BufferedReader(new FileReader(new File(inputFile)));
        	try
        	{
		        Integer.parseInt(in.readLine());
		        for (String x = in.readLine(); x != null; x = in.readLine()){
		        	testSet.addTestCase(x);
		        }
		        return testSet;
	        }
	        catch(IOException e){        	
	        }
	        finally{
	        	try
	        	{
	        		in.close();
	        	}
	        	catch(IOException e)
	        	{
	        	}
	        }
	    }
        catch(FileNotFoundException e){
        	
        }
        return testSet;
	}
}
