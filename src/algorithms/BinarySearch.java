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
public class BinarySearch {
    public static int search(int[] ar, int i) {
        int l = 0, r = ar.length - 1, m = -1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            if (l > r) {
                System.out.println("Item not found");
                return -1;
            }
            m = (l + r) / 2;
            if (ar[m] < i) {
                l = m + 1;
                sorted = false;
            }
            if (ar[m] > i) {
                r = m - 1;
                sorted = false;
            }
        }
        return m;
    }
}
