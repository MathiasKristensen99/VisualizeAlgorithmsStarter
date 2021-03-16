package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("BubbleSort", "Slow sorting type", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[]n = (int[]) super.getData();

        for(int i = 1; i < n.length; i++) {
            for (int j = 0; j < n.length - i; j++) {
                if (n[j] > n[j+1]) {
                    int tmp = n[j];
                    n[j] = n[j+1];
                    n[j+ 1] = tmp;
                }
            }
        }
    }
}
