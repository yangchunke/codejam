package net.remyang.codejam.lib;

public class SingleLineInputTestCase extends TestCase {

	public SingleLineInputTestCase(int caseNumber) {
		super(caseNumber, 1);
	}
	
	public String getInput(){
		return this.getInputAsString(0);
	}
}
