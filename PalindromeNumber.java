import java.util.*;
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int y = x;
        int sum = 0;
        while(x>0){
            sum = sum*10 + x%10;
            x = x/10;
        }
        if(y==sum) return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}