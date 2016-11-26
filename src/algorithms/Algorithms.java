/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ashley Allen
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = 10, bound = 10;
        Random rG = new Random();
        int[] ar = newAr(length, bound);
        
        System.out.println("Quick Sort");
        System.out.println("Original: " + Arrays.toString(ar));
        QuickSort.sortHoare(ar, 0, length - 1);
        System.out.println("Sorted: " + Arrays.toString(ar));
        System.out.println();
        
        System.out.println("Binary Search");
        int num = rG.nextInt(bound);
        System.out.println("Searching for " + num);
        System.out.println("Found at index " + BinarySearch.search(ar, num));
    }
    
    private static int[] newAr(int length, int bound) {
        Random rG = new Random();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = rG.nextInt(bound);
        }
        return ar;
    }
}
