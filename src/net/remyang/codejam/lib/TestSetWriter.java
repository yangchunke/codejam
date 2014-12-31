package net.remyang.codejam.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestSetWriter extends TestSetReaderWriterBase {

	private BufferedWriter _writer;

	@Override
	public void open(String file) {
		try {
			File f = new File(file);
			f.createNewFile();
			_writer = new BufferedWriter(new FileWriter(f));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void close() {
		try {
			_writer.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public void writeOutput(int caseNumber, String output) {
		try {
			_writer.write(String.format("Case #%d: %s", caseNumber, output));
			_writer.newLine();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
