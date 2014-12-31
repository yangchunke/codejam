package net.remyang.codejam.contests;

import java.util.HashMap;

import net.remyang.codejam.lib.TestCase;
import net.remyang.codejam.lib.TestCaseResolver;

/**
 * http://code.google.com/codejam/contest/351101/dashboard#s=p0
 *
 * Problem
 * 
 * You receive a credit C at a local store and would like to buy two items. You
 * first walk through the store and create a list L of all available items. From
 * this list you would like to buy two items that add up to the entire value of
 * the credit. The solution you provide will consist of the two integers
 * indicating the positions of the items in your list (smaller number first).
 */
public class StoreCredit extends TestCaseResolver {

	@Override
	public void resolve(TestCase tc) {
		StoreCreditTestCase myCase = (StoreCreditTestCase) tc;
		HashMap<Integer, Integer> posMap = new HashMap<Integer, Integer>();
		int credit = myCase.getCredit();
		int[] prices = myCase.getPrices();
		for (int i = 0; i < prices.length; i++) {
			int diff = credit - prices[i];
			if (posMap.containsKey(diff)) {
				tc.setOutput(String.format("%d %d", posMap.get(diff) + 1, i + 1));
				break;
			}
			posMap.put(prices[i], i);
		}
	}

	@Override
	public TestCase create(int caseNumber) {
		return new StoreCreditTestCase(caseNumber);
	}

}

class StoreCreditTestCase extends TestCase {
	public StoreCreditTestCase(int caseNumber) {
		super(caseNumber, 3);
	}

	public int getCredit() {
		return this.getInputAsInt(0);
	}

	public int getNumberOfItems() {
		return this.getInputAsInt(1);
	}

	public int[] getPrices() {
		return this.getInputAsIntArray(2);
	}
}