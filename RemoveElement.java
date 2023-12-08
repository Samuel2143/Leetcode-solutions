import java.util.*;
public class RemoveElement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int val = sc.nextInt();
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}