package net.remyang.codejam.contests;

import net.remyang.codejam.lib.TestCase;
import net.remyang.codejam.lib.TestCaseResolver;
import net.remyang.codejam.lib.TestSet;
import net.remyang.codejam.lib.TestSetReader;
import net.remyang.codejam.lib.TestSetWriter;

public class Main {

	public static void main(String[] args) {
		
		String path = "c:/Users/chunkeya/Downloads/";
		String pkg = "net.remyang.codejam.contests.";

		long elapsed = 0;
		System.out.println("Problem: " + args[0]);
		System.out.println("Input: " + args[1]);
		System.out.println("Output: " + args[2]);
		try
		{
			@SuppressWarnings("unchecked")
			Class<TestCaseResolver> cls = (Class<TestCaseResolver>) Class.forName(pkg + args[0]);
			TestCaseResolver inst = cls.newInstance();
			long start =System.nanoTime();
			TestSet ts = TestSetReader.read(path + args[1]);
			for(TestCase tc : ts.getTestCases())
			{
				inst.resolve(tc);
			}
			TestSetWriter.write(ts, path + args[2]);
			elapsed = System.nanoTime()-start;
		}
		catch(ClassNotFoundException e)
		{
			
		}
		catch(IllegalAccessException e1){
			
		}
		catch (InstantiationException e) {
			
		}
		
		System.out.println("Elapsed: " + elapsed);
	}
}