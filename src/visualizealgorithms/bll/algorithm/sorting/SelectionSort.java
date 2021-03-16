package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class SelectionSort extends GenericAlgorithm {

    public SelectionSort() {
        super("SelectionSort", "Better sorting", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[]n = (int[]) super.getData();

        for (int i = 0; i < n.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n.length; j++)
                if (n[j] < n[min_idx])
                    min_idx = j;

                int temp = n[min_idx];
                n[min_idx] = n[i];
                n[i] = temp;
        }
    }
}
