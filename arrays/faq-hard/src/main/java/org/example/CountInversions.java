package org.example;

public class CountInversions {
    public long numberOfInversions(int[] nums) {
        return mergesort(0, nums.length-1, nums);
    }

    public long mergesort(int l, int r, int[] nums){
        long count = 0;

        if(l<r){
            int mid = l+(r-l)/2;
            count+=mergesort(l, mid, nums);
            count+=mergesort(mid+1, r, nums);
            count+=merge(l, mid, r, nums);
        }

        return count;
    }

    public long merge(int l, int mid, int r, int[] nums){
        int count = 0;

        int[] temp = new int[r-l+1];
        int k =0;
        int i = l;
        int j = mid+1;
        while(i<=mid && j<=r){
            if(nums[i]<=nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
                count += mid-i+1;
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=r){
            temp[k++] = nums[j++];
        }

        i=l;
        for(int num : temp){
            nums[l++] = num;
        }
        return count;
    }


}
