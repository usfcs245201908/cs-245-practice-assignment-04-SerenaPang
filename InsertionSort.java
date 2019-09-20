public class InsertionSort implements SortingAlgorithm {
    @Override
    public void insertionSort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; ++i) {
            int target = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > target) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = target;
        }
    }
}
