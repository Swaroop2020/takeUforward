package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays.
 * The elements in the union must be in ascending order.
 *
 * The union of two arrays is an array where all values are distinct and are present in either
 * the first array, the second array, or both.
 */
public class UnionOfSortedArrays {

    // Two-Pointer approach
    public int[] approach1(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                addIfNotDuplicate(list, nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                addIfNotDuplicate(list, nums1[i]);
                i++;
            }else{
                addIfNotDuplicate(list, nums2[j]);
                j++;
            }

        }
        while(i<nums1.length){
            addIfNotDuplicate(list, nums1[i]);
            i++;
        }

        while(j<nums2.length){
            addIfNotDuplicate(list, nums2[j]);
            j++;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // using treeSet
    public int[] approach2(int[] nums1, int[] nums2){
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int num:nums1){
            treeSet.add(num);
        }

        for(int num:nums2){
            treeSet.add(num);
        }

        return treeSet.stream().mapToInt(Integer::intValue).toArray();
    }

    private void addIfNotDuplicate(List<Integer> list, int value){

        if(list.isEmpty() || list.get(list.size()-1) != value){
            list.add(value);
        }
    }

}
