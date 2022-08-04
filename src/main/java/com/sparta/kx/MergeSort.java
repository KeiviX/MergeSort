//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.kx;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 7, 9, 89};
        int[] arr2 = new int[]{2, 4, 6, 8, 10, 12, 14};
        System.out.println(mergeSortedArrays(arr1, arr2));
    }

    public static String mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int pointer1 = 0;
        int pointer2 = 0;

        int mergedPointer = 0;
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] < arr2[pointer2]){
                mergedArr[mergedPointer] = arr1[pointer1];
                pointer1 ++;
                mergedPointer ++;
            } else {
                mergedArr[mergedPointer] = arr2[pointer2];
                pointer2 ++;
                mergedPointer ++;
            }
        }

        while(pointer1 < arr1.length) {
            mergedArr[mergedPointer] = arr1[pointer1];
            pointer1 ++;
            mergedPointer ++;
        }

        while(pointer2 < arr2.length) {
            mergedArr[mergedPointer] = arr2[pointer2];
            pointer2 ++;
            mergedPointer ++;
        }
        return Arrays.toString(mergedArr);
    }
}
