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
public class BubbleSort {
    public static void sort(int[] ar, boolean descending) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < ar.length - 1; i++) {
                if (descending) {
                    if (ar[i] < ar[i + 1]) {
                        sorted = false;
                        swapElem(ar, i, i + 1);
                    }
                } else {
                    if (ar[i] > ar[i + 1]) {
                        sorted = false;
                        swapElem(ar, i, i + 1);
                    }
                }
            }
        }
    }
    
    private static void swapElem(int[] ar, int i1, int i2) {
        int temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }
}
