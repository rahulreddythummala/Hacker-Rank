// Give the number of swaps made for the elements which are out of order

import java.io.*;
import java.util.*;

public class Solution {
    public static int bubbleSort(int a[]){
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numberOfSwaps;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.printf("Array is sorted in %d swaps.%nFirst Element: %d%nLast Element: %d%n",
                        bubbleSort(arr),arr[0],arr[n-1]);
    }
}
