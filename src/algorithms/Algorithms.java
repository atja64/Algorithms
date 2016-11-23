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
        int[] temp = newAr(10, 100);
        System.out.println(Arrays.toString(temp));
        QuickSort.sortLomuto(temp, 0, 10 - 1);
        System.out.println(Arrays.toString(temp));
        temp = newAr(10, 100);
        System.out.println(Arrays.toString(temp));
        QuickSort.sortHoare(temp, 0, 10 - 1);
        System.out.println(Arrays.toString(temp));
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
