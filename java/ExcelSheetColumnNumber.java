package LeetCodeSol.java;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int base = 1;
        int sum = 0;
        for(int i= s.length()-1;i >= 0;i--){
            char c = s.charAt(i);
            sum += (int)(c-'A'+1)*base;
            base *= 26;
        }
        return sum;
    }
}
