import java.util.*;
public class SearchInsertPosition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        int[] arr = new int[nums.length+1];
        System.arraycopy(nums,0,arr,0,nums.length);
        arr[arr.length-1] = target;
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                return j;
            }
        }
        return -1;
    }
}