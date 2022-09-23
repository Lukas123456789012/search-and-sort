package sort;

import java.util.Arrays;

/**
 * Write a description of class Merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merge
{

    /**
     * Returns the sorted array
     */
    public static int[] sort(int[] arr, int l, int r) {
        int m = l + (r - l) / 2;
        if (l<r) {
            merge(arr, l, m, r);
        }
        return arr;
    }

    public static void merge(int arr[], int l, int m, int r) {

        int middle = arr.length/2;
        int ll = middle;
        int rl = arr.length - ll;
        int L[] = new int[ll];
        int R[] = new int[rl];
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[i];
        }
        for (int j = 0; j < R.length; j++) {
            R[j] = arr[j+ll];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < ll && j < rl) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                i++;
            }
        }
        while (i < ll) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < rl) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};    

        // Test the sort
        testSort(sort1(arr, 0, arr.length - 1));
    }

    public static void testSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("FAIL at index "+i);
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println("SUCCESS!");
    }

}
