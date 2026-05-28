package org.example;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] == nums2[j]){

                list.add(nums1[i]);
                i++;
                j++;

            } else if(nums1[i] < nums2[j]){

                i++;

            } else {

                j++;
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
