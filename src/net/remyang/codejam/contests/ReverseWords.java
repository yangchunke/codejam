package net.remyang.codejam.contests;

import net.remyang.codejam.lib.SingleLineInputTestCase;
import net.remyang.codejam.lib.TestCase;
import net.remyang.codejam.lib.TestCaseResolver;

public class ReverseWords extends TestCaseResolver {

	@Override
	public void resolve(TestCase tc) {
		SingleLineInputTestCase myTC = (SingleLineInputTestCase)tc;		
		String[] parts = myTC.getInput().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=parts.length-1;i>0;i--){
			sb.append(parts[i]);
			sb.append(' ');
		}
		sb.append(parts[0]);
		myTC.setOutput(sb.toString());
	}

	@Override
	public TestCase create(int caseNumber) {
		return new SingleLineInputTestCase(caseNumber);
	}
}
