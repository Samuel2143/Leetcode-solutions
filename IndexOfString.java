import java.util.*;
public class IndexOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        //indexOf is a built-in string function used ot find the index of the given string
        return haystack.indexOf(needle);
    }
}