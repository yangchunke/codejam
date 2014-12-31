package net.remyang.codejam.lib;

public abstract class TestCase {

	private int _caseNumber;
	private String[] _inputs;
	private String _output;

	public TestCase(int caseNumber, int lineOfInputs) {
		_caseNumber = caseNumber;
		_inputs = new String[lineOfInputs];
	}

	public void read(TestSetReader reader) {
		for (int i = 0; i < _inputs.length; i++) {
			_inputs[i] = reader.readLine();
		}
	}

	public void write(TestSetWriter writer) {
		writer.writeOutput(getCaseNumber(), getOutput());
	}

	public void setOutput(String output) {
		_output = output;
	}

	protected int getInputAsInt(int index) {
		return Integer.parseInt(getInputs()[index]);
	}

	protected String getInputAsString(int index) {
		return getInputs()[index];
	}

	protected int[] getInputAsIntArray(int index) {
		String[] arrays = getInputs()[index].split(" ");
		int[] ret = new int[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			ret[i] = Integer.parseInt(arrays[i]);
		}
		return ret;
	}

	protected Integer[] getInputAsIntegerArray(int index) {
		return toIntegerArray(getInputAsIntArray(index));
	}

	private int getCaseNumber() {
		return _caseNumber;
	}

	private String[] getInputs() {
		return _inputs;
	}

	private String getOutput() {
		return _output;
	}

	private static Integer[] toIntegerArray(int[] intArray) {
		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}
}
