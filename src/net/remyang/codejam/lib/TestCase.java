package net.remyang.codejam.lib;

public class TestCase {

	private int _caseNumber;
	private String _input;
	private String _output;

	public TestCase(int caseNumber, String input){
		_caseNumber = caseNumber;
		_input = input;
	}
	
	public int getCaseNumber(){
		return _caseNumber;
	}
	
	public String getInput(){
		return _input;
	}
	
	public String getOutput(){
		return _output;
	}
	
	public void setOutput(String output){
		_output = output;
	}	
}
