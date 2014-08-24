package net.remyang.codejam.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestSetWriter extends TestSetReaderWriterBase {
	
	private BufferedWriter _writer;

	@Override
	public void open(String file) {
		try
	    {
		    File f = new File(file);
		    f.createNewFile();	
		    _writer = new BufferedWriter(new FileWriter(f));
	    }
	    catch(FileNotFoundException e)
	    {
			e.printStackTrace();
	    }
	    catch(IOException e)
	    {
			e.printStackTrace();
	    }		
	}

	@Override
	public void close() {
		try {
			_writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeOutput(int caseNumber, String output){
    	try {
    		_writer.write(String.format("Case #%d: %s", caseNumber, output));
			_writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
