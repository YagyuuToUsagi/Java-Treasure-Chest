package selectionsort;

/**
 *
 * @author brianaranda
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = new int[10000];
        for (int i = 0; i < values.length; i++) {
            values[i] = (int)(Math.random() * 10000);
        }
        System.out.print("The unsorted values are: ");
        for (int element : values) {
            System.out.print(element + " ");
        }
        System.out.println();
        long startTime = System.currentTimeMillis();
        insertionSort(values);
        long endTime = System.currentTimeMillis();
        

        System.out.print("The sorted values are ");
    }

    private static void selectionSort(int[] values) {
        int startScan, index, minIndex, minValue;

        for (startScan = 0; startScan < (values.length - 1); startScan++) {
            minIndex = startScan;
            minValue = values[startScan];
            for (index = startScan + 1; index < values.length; index++) {
                if (values[index] < minValue) {
                    minValue = values[index];
                    minIndex = index;
                }
            }
            values[minIndex] = values[startScan];
            values[startScan] = minValue;
        }
    }

    private static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int value = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > value) {
                
            }
        }
    }
}
