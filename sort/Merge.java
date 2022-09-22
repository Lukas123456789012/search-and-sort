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
  public static int[] sort(int[] arr) {
    if (1 < arr.length) {
        
        int middle = arr.length/2;
        int leftLength = middle;
        int rightLength = arr.length - leftLength;
        int Left[] = new int[leftLength];
        int Right[] = new int[rightLength];
        for (int k = 0; k < Left.length; k++) {
            Left[k] = arr[k];
            System.out.print(Left[k]);
        }
        for (int k = 0; k < Right.length; k++) {
            Right[k] = arr[k+leftLength];
            System.out.print(Right[k]);
        }
        int i = 0;
        int j = 0;
        int k = leftLength;
        while (i< leftLength && j < rightLength) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            arr[k] = Right[j];
            j++;
            k++;
            }
        }
    return arr;
  }
  public void merge(int arr[], int l, int m, int r) {
      int middle = arr.length/2;
        int leftLength = middle;
        int rightLength = arr.length - leftLength;
        int Left[] = new int[leftLength];
        int Right[] = new int[rightLength];
        for (int k = 0; k < Left.length; k++) {
            Left[k] = arr[k];
            System.out.print(Left[k]);
        }
        for (int k = 0; k < Right.length; k++) {
            Right[k] = arr[k+leftLength];
            System.out.print(Right[k]);
        }
        int i = 0;
        int j = 0;
        int k = leftLength;
        while (i< leftLength && j < rightLength) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            arr[k] = Right[j];
            j++;
            k++;
            }
  }
  public static void main(String[] args) {
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};    
    
    // Test the sort
    testSort(sort(arr));
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
