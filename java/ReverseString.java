package Leetcode;

public class ReverseString {
    public String reverseString(String s) {
        char[] array = s.toCharArray();
        
        for(int i=0;i<s.length()/2;i++){
            swap(array,i,s.length()-i-1);
        }
        return String.valueOf(array);
    }
    void swap(char[] s, int i,int j){
       char tmp = s[i];
       s[i]= s[j];
       s[j] = tmp;
    }
}
