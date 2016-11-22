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
        int arLength = 10;
        Random randomGenerator = new Random();
        int[] ar = new int[arLength];
        for (int i = 0; i < arLength; i++) {
            ar[i] = randomGenerator.nextInt(100);
        }
        System.out.println(Arrays.toString(ar));
        QuickSort.sort(ar, 0, arLength - 1);
        System.out.println(Arrays.toString(ar));
    }
    
}
