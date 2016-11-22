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
    
    public static void sort(int[] ar, int lo, int hi) {
        if (lo < hi) {
            int p = partition(ar, lo, hi);
            sort(ar, lo, p - 1);
            sort(ar, p + 1, hi);
        }
    }
    
    private static int partition(int[] ar, int lo, int hi) {
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
    
    private static void swapElem(int[] ar, int i1, int i2) {
        int temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }
    
    private static void printArray(int[] ar, int to, int pivot, int from, int pass) {
        System.out.printf("%02d", pass);
        System.out.print(" [");
        String colour;
        for (int j = 0; j < ar.length; j++) {
            if (j == to) {
                colour = ANSI_GREEN;
            } else if (j == pivot) {
                colour = ANSI_RED;
            } else if (j == from) {
                colour = ANSI_BLUE;
            } else {
                colour = ANSI_RESET;
            }
            if (j == ar.length - 1) {
                System.out.println(colour + ar[j] + ANSI_RESET + "]");
            } else {
                System.out.print(colour + ar[j] + ANSI_RESET + ", ");                
            }
        }   
    }
}