package net.remyang.codejam.lib;

public abstract class TestCaseResolver {
	
	public abstract void resolve(TestCase tc);
	
	public abstract TestCase create(int caseNumber);
}
