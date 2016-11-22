/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

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
    
    public static int[] sort(int[] ar) {
        if (ar.length < 2) {
            return ar;
        }
        int passCounter = 0;
        int pivotLoc = ar.length / 2;
//        System.out.println("pivot: " + ar[pivotLoc]);
        int i = 0;
        while (i < pivotLoc) {
            if (ar[i] > ar[pivotLoc]) {
                moveElem(ar, i, pivotLoc);
                pivotLoc--;
                printArray(ar, pivotLoc + 1, pivotLoc, i, passCounter);                
            } else {
                printArray(ar, i, pivotLoc, -1, passCounter);
                i++;
            }
            passCounter++;
        }
        i = ar.length - 1;
        while (i > pivotLoc) {
            if (ar[i] < ar[pivotLoc]) {
                moveElem(ar, i, pivotLoc);
                pivotLoc++;
                printArray(ar, pivotLoc - 1, pivotLoc, i, passCounter);
            } else {
                printArray(ar, i, pivotLoc, -1, passCounter);
                i--;
            }
            passCounter++;
        }
        return mergeArrays(sort(Arrays.copyOfRange(ar, 0, pivotLoc)), ar[pivotLoc], sort(Arrays.copyOfRange(ar, pivotLoc + 1, ar.length)));
    }
    
    private static void moveElem(int[] ar, int from, int to) {
        if (from < 0 || from >= ar.length || to < 0 || to >= ar.length) {
            System.out.println("moveTo failed: Invalid parameters");
            return;
        }
//        System.out.println("Moving " + from + " to " + to);
        int temp = ar[from];
        if (from < to) {
            for (int i = from; i < to; i++) {
                ar[i] = ar[i + 1];
            }
        } else {
            for (int i = from; i > to; i--) {
                ar[i] = ar[i - 1];
            }
        }
        ar[to] = temp;
    }
    
    private static void printArray(int[] ar, int to, int pivot, int from, int pass) {
        System.out.printf("%02d", pass);
        System.out.print(" [");
        String colour;
        for (int j = 0; j < ar.length - 1; j++) {
            if (j == to) {
                colour = ANSI_GREEN;
            } else if (j == pivot) {
                colour = ANSI_RED;
            } else if (j == from) {
                colour = ANSI_BLUE;
            } else {
                colour = ANSI_RESET;
            }
            System.out.print(colour + ar[j] + ANSI_RESET + ", ");
        }
        int last = ar.length - 1;
        if (last == to) {
            colour = ANSI_GREEN;
        } else if (last == pivot) {
            colour = ANSI_RED;
        } else if (last == from) {
                colour = ANSI_BLUE;
        } else {
            colour = ANSI_RESET;
        }
        System.out.println(colour + ar[last] + ANSI_RESET + "]");       
    }
    
    private static int[] mergeArrays(int[] firstHalf, int pivot, int[] secondHalf) {
        int arCounter = 0;
        int[] result = new int[firstHalf.length + 1 + secondHalf.length];
        for (int i = 0; i < firstHalf.length; i++) {
            result[arCounter] = firstHalf[i];
            arCounter++;
        }
        result[arCounter] = pivot;
        arCounter++;
        for (int i = 0; i < secondHalf.length; i++) {
            result[arCounter] = secondHalf[i];
            arCounter++;
        }
        return result;
    }
}
