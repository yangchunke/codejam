package net.remyang.codejam.lib;

public abstract class TestCase {

	private int _caseNumber;
	private String[] _inputs;
	private String _output;

	public TestCase(int caseNumber, int lineOfInputs){
		_caseNumber = caseNumber;
		_inputs = new String[lineOfInputs];
	}
	
	public void read(TestSetReader reader)
	{
		for(int i=0; i<_inputs.length;i++){
			_inputs[i] = reader.readLine();
		}
	}
	public void write(TestSetWriter writer)
	{
		writer.writeOutput(getCaseNumber(), getOutput());
	}
	
	public int getCaseNumber(){
		return _caseNumber;
	}
	
	protected String[] getInputs(){
		return _inputs;
	}
	
	public String getOutput(){
		return _output;
	}
	
	public void setOutput(String output){
		_output = output;
	}	
}
