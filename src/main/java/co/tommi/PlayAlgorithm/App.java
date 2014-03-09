package co.tommi.PlayAlgorithm;

public class App
{
    public static void main( String[] args )
    {
    }

    /**
     * Assuming there are no duplicates
     * @param values
     * @param key
     * @return
     */
    public static int binarySearch(int[] values, int key, int ssMin, int ssMax) {
    	System.out.println("ssMin: " + ssMin + " ssMax: " + ssMax);

    	if (values.length == 0)
    		return 99999999;

    	boolean isOddNoOfValues = ((ssMax - ssMin + 1) % 2) == 1;

    	if (ssMin == ssMax) {
    		return ssMin;
    	} else if (isOddNoOfValues) {
    		int midPos = (ssMax - ssMin) / 2;

    		if (values[midPos] > key) {
        		return binarySearch(values, key, ssMin, midPos-1);
        	} else if (values[midPos] < key) {
        		return binarySearch(values, key, midPos+1, ssMax);
        	} else {
        		return midPos;
        	}
    	} else {
    		int midPosLeft = ssMin + ((ssMax - ssMin) / 2);
    		int midPosRight = ssMin + (((ssMax - ssMin) / 2) + 1);

    		if (values[midPosLeft] > key && values[midPosRight] > key) {
    			return binarySearch(values, key, ssMin, midPosLeft-1);
        	} else if (values[midPosLeft] < key && values[midPosRight] < key) {
        		return binarySearch(values, key, midPosRight+1, ssMax);
        	} else if (values[midPosLeft] == key) {
        		return midPosLeft;
        	} else {
        		return midPosRight;
        	}
    	}
    }
}
