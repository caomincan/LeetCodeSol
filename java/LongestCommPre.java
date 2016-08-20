/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * @author caomi
 *
 */
public class LongestCommPre {
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        
        int minLength = strs[0].length();
        for(int i = 0;i<strs.length;i++){
            int l = strs[i].length();
            if(l < minLength) minLength = l;
        }
        
        
            for(int j=0;j<minLength;j++){
              for(int i= 0; i< strs.length-1 ;i++){
                if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                    return strs[0].substring(0,j);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }

}
