package net.remyang.codejam.contests;

import net.remyang.codejam.lib.SingleLineInputTestCase;
import net.remyang.codejam.lib.TestCase;
import net.remyang.codejam.lib.TestCaseResolver;

/**
 * http://code.google.com/codejam/contest/351101/dashboard#s=p1
 *
 * Problem
 * 
 * Given a list of space separated words, reverse the order of the words. Each
 * line of text contains L letters and W words. A line will only consist of
 * letters and space characters. There will be exactly one space character
 * between each pair of consecutive words.
 */
public class ReverseWords extends TestCaseResolver {

	@Override
	public void resolve(TestCase tc) {
		SingleLineInputTestCase myTC = (SingleLineInputTestCase) tc;
		String[] parts = myTC.getInput().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = parts.length - 1; i > 0; i--) {
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
