package strategy;

public class InsertionSort implements ISortingMethods{
    public int[] sort(int[] numList){
        int[] result = new int[numList.length];
        System.arraycopy(numList, 0, result, 0, numList.length);
        
        for (int i = 1; i < result.length; i++) {
            int key = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j = j - 1;
            }
            result[j + 1] = key;
        }
        return result;
    }
}