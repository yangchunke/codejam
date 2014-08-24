package net.remyang.codejam.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestSetWriter {
	public static void write(TestSet testSet, String outputFile){
		try
	    {
		    File file = new File(outputFile);
		    file.createNewFile();	
		    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(TestCase tc : testSet.getTestCases())
			{
				writer.write(String.format("Case #%d: %s", tc.getCaseNumber(), tc.getOutput()));
		    	writer.newLine();
		    }
		    writer.close();
	    }
	    catch(FileNotFoundException e)
	    {
	        System.out.println("File Not Found");
	    }
	    catch(IOException e)
	    {
	        System.out.println("something messed up");
	    }
	}
}
