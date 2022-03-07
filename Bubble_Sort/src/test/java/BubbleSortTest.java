import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void bubblesortarray() {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
    }
}
