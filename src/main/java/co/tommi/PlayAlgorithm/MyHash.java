package co.tommi.PlayAlgorithm;

public class MyHash {
	String[] bucket = new String[10];

	void put(int key, String value) {
		int pos = calculatePosition(key);

		if (pos + 1 > bucket.length) {
			resize(pos);
		}

		bucket[pos] = value;
	}

	String get(int key) {
		int pos = calculatePosition(key);

		if (pos > bucket.length - 1) {
			return null;
		}

		return bucket[pos];
	}

	int calculatePosition(int key) {
		int pos = key;
		return pos;
	}

	private void resize(int posAttemptedToAccess) {
		int minimumNewSize = posAttemptedToAccess + 1;

		if (minimumNewSize <= bucket.length) {
			return;
		}

		String[] newBucket = new String[minimumNewSize];
		for (int i = 0; i < bucket.length; i++) {
			newBucket[i] = bucket[i];
		}

		bucket = newBucket;
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < bucket.length; i++) {
			output += String.format("Position %02d: %s", i, bucket[i]) + "\n";
		}

		return output;
	}
}
