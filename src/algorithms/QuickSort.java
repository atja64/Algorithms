/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Ashley Allen
 */
public class QuickSort {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void sortLomuto(int[] ar, int lo, int hi) {
        if (lo < hi) {
            int p = partitionLomuto(ar, lo, hi);
            sortLomuto(ar, lo, p - 1);
            sortLomuto(ar, p + 1, hi);
        }
    }
    
    private static int partitionLomuto(int[] ar, int lo, int hi) {
        int pivot = ar[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (ar[j] <= pivot) {
                swapElem(ar, i, j);
                i++;
            }
        }
        swapElem(ar, i, hi);
        return i;
    }
    
    public static void sortHoare(int[] ar, int lo, int hi) {
        if (lo < hi) {
            int p = partitionHoare(ar, lo, hi);
            sortHoare(ar, lo, p);
            sortHoare(ar, p + 1, hi);
        }
    }
    
    private static int partitionHoare(int[] ar, int lo, int hi) {
        int pivot = ar[lo];
        int i = lo - 1;
        int j = hi + 1;
        while (true) {
            do {
                i++;
            } while (ar[i] < pivot);
            do {
                j--;
            } while (ar[j] > pivot);
            if (i >= j) {
                return j;
            }
            swapElem(ar, i, j);
        }
    }
    
    private static void swapElem(int[] ar, int i1, int i2) {
        int temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }
}