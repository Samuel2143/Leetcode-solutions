import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int[] arr2 = {2,5,6};
        merge(arr,3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        System.out.println(java.util.Arrays.toString(nums1));
    }
}