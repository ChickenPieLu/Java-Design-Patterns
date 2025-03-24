package strategy;

public class BubbleSort implements ISortingMethods{
    public int[] sort(int[] numList){
        int[] result = new int[numList.length];
        System.arraycopy(numList, 0, result, 0, numList.length);
        int n = result.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    // Swap result[j] and result[j + 1]
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the list is sorted
            if (!swapped)
                break;
        }
        return result;
    }
}
