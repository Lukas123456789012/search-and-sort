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
    static void merge(int arr[], int l, int m, int r)
    {
        int left = m - l + 1;
        int right = r - m;
        int L[] = new int[left];
        int R[] = new int[right];
        for (int i = 0; i < left; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < right; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static int[] sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};    

        // Test the sort
        int f = arr.length -1;
        testSort(sort(arr, 0, f));
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
