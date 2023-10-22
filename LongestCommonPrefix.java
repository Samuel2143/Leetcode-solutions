//There are two methods for solving this problem..
// Method 1:

import java.util.*;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)==last.charAt(i)){
                res.append(first.charAt(i));
            }
            else {
                return res.toString();
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}

// Method 2:

import java.util.*;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index = 0;
        while(index<first.length()&&index<last.length()){
            if(first.charAt(index)==last.charAt(index)){
                index++;
            }
            else break;
        }
        return first.substring(0,index);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}

