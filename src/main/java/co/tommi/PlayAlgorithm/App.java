package co.tommi.PlayAlgorithm;

public class App
{
    public static void main( String[] args )
    {
    }

    /**
     * Recursive. Assume there are no duplicates.
     * @param values
     * @param key
     * @return
     */
    public static int binarySearch(int[] values, int key, int ssMin, int ssMax) {
    	System.out.println("SS Min: " + ssMin + "\tSS Max: " + ssMax);

    	if (values.length == 0)
    		return -1;

    	if (values.length == 1) {
    		if (values[ssMin] == key) {
    			return ssMin;
    		} else {
    			return -1;
    		}
    	}

    	// (n + 1) / 2
    	int midPos = ssMin + ((ssMax - ssMin + 1) / 2);

    	if (values[midPos] > key) {
    		return binarySearch(values, key, ssMin, midPos-1);
    	} else if (values[midPos] < key) {
    		return binarySearch(values, key, midPos+1, ssMax);
    	} else {
    		return midPos;
    	}
    }
}
