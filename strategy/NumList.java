package strategy;

public class NumList {
    private int[] numList;
    //strategy design pattern
    private ISortingMethods sortingMethod;

    public NumList(int[] numList, ISortingMethods sortingMethod){
        this.numList = numList;
        this.sortingMethod = sortingMethod;
    }

    public void sortList(){
        numList = sortingMethod.sort(numList);
    }

    public String toString(){
        String result = "[";
        for (int element:numList){
            result += element + ",";
        }
        result = result.substring(0,result.length()-1) + "]";
        return result;
    }
}
