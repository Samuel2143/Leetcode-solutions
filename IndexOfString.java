import java.util.*;
public class IndexOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String haystack = sc.nextLine();
        System.out.println("Enter the string to be searched:");
        String needle = sc.nextLine();
        System.out.println("The index in which the string is found is "+ strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        //indexOf is a built-in string function used to find the index of the given string
        
        return haystack.indexOf(needle);
        
        //If the string is found it returns the index number, if it is not found it returns -1
    }
}
