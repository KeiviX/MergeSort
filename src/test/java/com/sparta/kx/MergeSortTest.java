package com.sparta.kx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MergeSortTest{

    @Test
    @DisplayName("if there are 2 ordered arrays, returns one merged array")
    void MergeSortTest() {
        int[] arr1 = {2, 12, 14, 100};
        int[] arr2 = {5, 22, 78, 99};
        Assertions.assertEquals("[2, 5, 12, 14, 22, 78, 99, 100]", MergeSort.mergeSortedArrays(arr1, arr2));
    }
    @Test
    @DisplayName("if there are duplicates, it should return sorted merge array with no problems")
    void duplicateEntryTest() {
        int[] arr1 = {1, 2, 3, 8};
        int[] arr2 = {1, 3, 6, 9};
        Assertions.assertEquals("[1, 1, 2, 3, 3, 6, 8, 9]", MergeSort.mergeSortedArrays(arr1, arr2));
    }

    @Test
    @DisplayName("If one array is bigger than the other and it completes, return the rest of that array at the end")
    void differentArrayLengths() {
        int[] arr1 = {1, 27, 32, 54};
        int[] arr2 = {3};
        Assertions.assertEquals("[1, 3, 27, 32, 54]", MergeSort.mergeSortedArrays(arr1, arr2));
    }

    @Test
    @DisplayName("If arr1 is empty, return only arr2")
    void arr1Empty(){
        int[] arr1 = {};
        int[] arr2 = {1,2,3,4};
        Assertions.assertEquals("[1, 2, 3, 4]", MergeSort.mergeSortedArrays(arr1, arr2));
    }

    @Test
    @DisplayName("If arr2 is empty, the merged array should just contain whats in arr1")
    void arr2Empty() {
        int[] arr2 = {5, 6, 7, 8};
        int[] arr1 = {};
        Assertions.assertEquals("[5, 6, 7, 8]", MergeSort.mergeSortedArrays(arr1, arr2));
    }

}