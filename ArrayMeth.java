
import java.util.Arrays;

class ArrayMeth {

    static void printarr(int[] a) {
        for (Object o : a) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //An array is a fixed-size, ordered collection of elements of the same data type. Each element is accessed using an index.

        //can be define as 
        int[] numbers;
        int numbs[];

        //assignment
        int[] nums = new int[5];
        //or
        int[] ns = {1, 2, 3, 4, 5};

        //methods
        int[] arr = {4, 3, 6, 2, 7};
        printarr(arr);

        Arrays.sort(arr);
        printarr(arr);

        int[] arr2 = new int[5];
        Arrays.fill(arr2, 10);
        printarr(arr2);

        printarr(Arrays.copyOf(arr, arr.length));

        System.out.println(Arrays.binarySearch(arr, 6));

        
    }
}
