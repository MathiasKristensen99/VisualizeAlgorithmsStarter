package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class InsertionSort extends GenericAlgorithm {

    public InsertionSort() {
        super("InsertionSort", "Julian", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[]n = (int[]) super.getData();

        for (int i = 1; i < n.length; ++i) {
            int key = n[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && n[j] > key) {
                n[j + 1] = n[j];
                j = j - 1;
            }
            n[j + 1] = key;
        }
    }
}
