package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class QuickSort extends GenericAlgorithm {

    public QuickSort() {
        super("Quick Sort", "Quick Sort BETTER", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[]n = (int[]) super.getData();
        quickSort(n, 0, n.length-1);
    }

    public void quickSort(int[]n, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(n, begin, end);
            quickSort(n, begin, partitionIndex-1);
            quickSort(n, partitionIndex+1, end);
        }
    }

    private int partition(int[]n, int begin, int end) {

        int pivot = n[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (n[j] <= pivot) {
                i++;

                int swapTemp = n[i];
                n[i] = n[j];
                n[j] = swapTemp;
            }
        }
        int swapTemp = n[i+1];
        n[i+1] = n[end];
        n[end] = swapTemp;

        return i+1;
    }
}
