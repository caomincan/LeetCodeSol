package LeetCodeSol.java;

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
        int[] alpha = new int[26];
        char[] sArr = s.toCharArray();
        for(int i=0;i<26;i++) alpha[i] = -1;
        for(int i =0;i<sArr.length;i++){
            int id = (int)(sArr[i]-'a');
            if(alpha[id]== -1){
                // first meet location
                alpha[id] = i;
            } else if(alpha[id] >= 0){
                alpha[id] = -2;
            }
        }
        int result = sArr.length;
        for(int i=0;i<26;i++){
            if(alpha[i]<result && alpha[i]>=0){
                result = alpha[i];
            }
        }
        return result==sArr.length? -1: result;
    }
}
