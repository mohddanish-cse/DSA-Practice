//String Palindrome
//Link: https://www.geeksforgeeks.org/problems/palindrome-string0817/1

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
//import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder reverse = new StringBuilder();
        for(int i = S.length()-1;i>=0;i--){
            reverse.append(S.charAt(i));
        }
        if(S.contentEquals(reverse))
            return 1;
        return 0;
    }
}