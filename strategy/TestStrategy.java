package strategy;
import test.ATest;

public class TestStrategy extends ATest {
    public static void main(String[] args) {
        int[] ls = {1,7,6,4,89,2,0};
        NumList BubbleSortList = new NumList(ls.clone(), new BubbleSort());
        NumList InsertionSortList =new NumList(ls.clone(), new InsertionSort());
        BubbleSortList.sortList();
        InsertionSortList.sortList();
        print(BubbleSortList.toString());
        print(InsertionSortList.toString());
    }
}
