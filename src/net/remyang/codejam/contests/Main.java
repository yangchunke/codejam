package net.remyang.codejam.contests;

import net.remyang.codejam.lib.TestCaseResolver;
import net.remyang.codejam.lib.TestSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String path = "c:/Users/chunkeya/Downloads/";
		String pkg = "net.remyang.codejam.contests.";

		System.out.println("Problem: " + args[0]);
		System.out.println("Input: " + args[1]);
		System.out.println("Output: " + args[2]);

		try {
			Class<TestCaseResolver> cls = (Class<TestCaseResolver>) Class
					.forName(pkg + args[0]);
			if (cls != null) {
				TestCaseResolver inst = cls.newInstance();
				if (inst != null) {
					long start = System.currentTimeMillis();
					TestSet ts = new TestSet(inst, path + args[1], path
							+ args[2]);
					ts.run();
					System.out.println("Elapsed: "
							+ (System.currentTimeMillis() - start) + " ms");
				}
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (InstantiationException | IllegalAccessException e) {
			System.err.println(e.getMessage());
		}

	}
}
