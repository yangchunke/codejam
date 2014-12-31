package net.remyang.codejam.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestSetReader extends TestSetReaderWriterBase {

	private BufferedReader _in;

	public TestSetReader() {
	}

	@Override
	public void open(String file) {
		try {
			_in = new BufferedReader(new FileReader(new File(file)));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void close() {
		try {
			_in.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public int readInteger() {
		int ret = 0;
		try {
			ret = Integer.parseInt(_in.readLine());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return ret;
	}

	public String readLine() {
		String ret = null;
		try {
			ret = _in.readLine();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return ret;
	}
}
