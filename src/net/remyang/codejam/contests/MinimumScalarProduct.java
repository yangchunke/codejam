package net.remyang.codejam.contests;

import java.util.Arrays;

import net.remyang.codejam.lib.TestCase;
import net.remyang.codejam.lib.TestCaseResolver;

/**
 * http://code.google.com/codejam/contest/32016/dashboard#s=p0
 *
 * Problem
 * 
 * You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar
 * product of these vectors is a single number, calculated as
 * x1y1+x2y2+...+xnyn.
 * 
 * Suppose you are allowed to permute the coordinates of each vector as you
 * wish. Choose two permutations such that the scalar product of your two new
 * vectors is the smallest possible, and output that minimum scalar product.
 */
public class MinimumScalarProduct extends TestCaseResolver {

	@Override
	public void resolve(TestCase tc) {
		MinimumScalarProductTestCase myCase = (MinimumScalarProductTestCase) tc;

		int[] v1 = myCase.getV1();
		Arrays.sort(v1);

		int[] v2 = myCase.getV2();
		Arrays.sort(v2);

		long ret = 0;
		for (int i = 0, j = v2.length - 1; i < v1.length && j >= 0; i++, j--) {
			long l = v1[i];
			l *= v2[j];
			ret += l;
		}

		tc.setOutput(String.format("%d", ret));
	}

	@Override
	public TestCase create(int caseNumber) {
		return new MinimumScalarProductTestCase(caseNumber);
	}

}

class MinimumScalarProductTestCase extends TestCase {
	public MinimumScalarProductTestCase(int caseNumber) {
		super(caseNumber, 3);
	}

	public int getSize() {
		return this.getInputAsInt(0);
	}

	public int[] getV1() {
		return this.getInputAsIntArray(1);
	}

	public int[] getV2() {
		return this.getInputAsIntArray(2);
	}
}
