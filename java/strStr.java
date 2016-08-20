/**
 * Implement strStr().
 *
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * @author caomi
 *
 */
public class strStr {
	  public int strStr(String haystack, String needle) {
	        int needleLength = needle.length();
	        int haystackLength = haystack.length();
	        if(needleLength == 0 && haystackLength == 0) return 0;
	        if(needleLength == 0 ) return 0;
	        if(haystackLength == 0) return -1;
	        for(int i=0; i<= haystackLength-needleLength;i++){
	            String tmp = haystack.substring(i,i+needleLength);
	            if(tmp.compareTo(needle) == 0) return i;
	        }
	        return -1;
	    }
}
