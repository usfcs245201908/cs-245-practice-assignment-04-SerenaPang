public class SelectionSort implements SortingAlgorithm {


	@Override
	public void insertionSort(int[] a) {
		   int len = a.length;

	        
	        for (int i = 0; i < len - 1; i++) {
	          
	            int miniIndex = i;
	            for (int j = i + 1; j < len; j++)
	                if (a[j] < a[miniIndex])
	                    miniIndex = j;

	           
	            int temp = a[miniIndex];
	            a[miniIndex] = a[i];
	            a[i] = temp;
	        }
	}
}
