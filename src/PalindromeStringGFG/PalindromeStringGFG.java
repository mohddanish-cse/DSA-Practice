package PalindromeStringGFG;//String Palindrome
//Link: https://www.geeksforgeeks.org/problems/palindrome-string0817/1

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