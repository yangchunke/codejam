package net.remyang.codejam.lib;

import java.util.ArrayList;
import java.util.List;

public class TestSet {
	
	private int _numOfTestCases;
	private List<TestCase> _testCases;
	
	public TestSet(){
		_numOfTestCases = 0;
		_testCases = new ArrayList<TestCase>();
	}
	
	public void addTestCase(String testCaseInput){
		_testCases.add(new TestCase(++_numOfTestCases, testCaseInput));
	}
	
	public List<TestCase> getTestCases(){
		return _testCases;
	}	
}
