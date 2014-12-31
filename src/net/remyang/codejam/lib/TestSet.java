package net.remyang.codejam.lib;

import java.util.ArrayList;
import java.util.List;

public class TestSet {

	private TestCaseResolver _resolver;
	private List<TestCase> _testCases;
	private String _input;
	private String _output;

	public TestSet(TestCaseResolver resolver, String input, String output) {
		_resolver = resolver;
		_testCases = new ArrayList<TestCase>();
		_input = input;
		_output = output;
	}

	public void run() {
		this.read();
		this.solve();
		this.write();
	}

	private void read() {
		TestSetReader reader = new TestSetReader();
		reader.open(_input);
		int numOfTestCases = reader.readInteger();
		for (int i = 0; i < numOfTestCases; i++) {
			TestCase tc = _resolver.create(i + 1);
			tc.read(reader);
			_testCases.add(tc);
		}
		reader.close();
	}

	private void solve() {
		for (TestCase tc : getTestCases()) {
			_resolver.resolve(tc);
		}
	}

	private void write() {
		TestSetWriter writer = new TestSetWriter();
		writer.open(_output);
		for (TestCase tc : getTestCases()) {
			tc.write(writer);
		}
		writer.close();
	}

	private List<TestCase> getTestCases() {
		return _testCases;
	}
}
