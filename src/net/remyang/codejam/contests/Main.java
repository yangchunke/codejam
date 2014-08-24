package net.remyang.codejam.contests;

import net.remyang.codejam.lib.TestCaseResolver;
import net.remyang.codejam.lib.TestSet;

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
			long start = System.nanoTime();
			TestSet ts = new TestSet(inst, path + args[1], path + args[2]);
			ts.run();
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
