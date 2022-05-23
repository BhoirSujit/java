import java.util.Scanner;

import javax.security.sasl.SaslException;
import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;

public class LinearSearch {

    public static Scanner sc;
    public static void main(String[] args) {
        System.out.println("Linear Search ");

        //initialize
        sc = new Scanner(System.in);

        //getting and printing array
        int[] myArr = getArray();
        printArray(myArr);

        //linear search
        System.out.print("\nEnter the Element for search : ");
        int ele = sc.nextInt();

        int pos = linearSearch(myArr, ele);
        if (pos != -1) {
            System.out.println("Index of element is : " + pos);
        } else {
            System.out.println("Element not found ");
        }


    }

    public static int[] getArray(){
        System.out.print("Enter length of Array : ");
        int len = sc.nextInt();
        
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int ob : arr) {
            System.out.print(ob + " ");
        }
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i ++ ) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
