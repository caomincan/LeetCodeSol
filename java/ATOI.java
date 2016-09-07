package LeetCodeSol.java;
/**
 * mplement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * 
 * @author caomi
 *
 */
public class ATOI {
	public int myAtoi(String str) {
        if(str.length() == 0 || str == null) return 0;
        str = str.trim();
        if(str.length() == 0) return 0;
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char[] strArr = str.toCharArray();
        long sum = 0;
        boolean negative_flag = false;
        int st = 0;
        if(strArr[0] == '-') {
            negative_flag = true;
            st = 1;
        } else if(strArr[0] == '+'){
            st = 1;
        }
        for(int i = st;i<strArr.length;i++){
            if(strArr[i] <= '9' && strArr[i] >= '0'){
                sum = sum*10+ (int)(strArr[i]-'0');
            } else {
                break;
            }
            if(sum > max) break;
        }
        int result = 0;
        if(negative_flag) sum = -sum;
        if(sum >= max) {
            result = max;
        }else if(sum <= min){
            result = min;
        }else {
            result = (int)(sum);
        }
        return result;
    }
}
