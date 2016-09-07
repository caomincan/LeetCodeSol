package LeetCodeSol.java;
/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", 
 * it is the fifth second-level revision of the second first-level revision.
 *
 * @author caomi
 *
 */
public class CompareVersion {
	 public int compareVersion(String version1, String version2) {
	        String[] ver1 = version1.split("\\.");
	        String[] ver2 = version2.split("\\.");
	        int n = ver1.length>ver2.length? ver1.length:ver2.length;
	        int[] v1 = new int[n];
	        int[] v2 = new int[n];
	        
	        for(int i= 0;i<ver1.length;i++) v1[i] = Integer.valueOf(ver1[i]);
	        for(int i= 0;i<ver2.length;i++) v2[i] = Integer.valueOf(ver2[i]);
	        
	       int result = 0;
	       for(int i = 0 ;i < n;i++){
	           if(v1[i]<v2[i]){
	               return -1;
	           } else if(v1[i]>v2[i]){
	               return 1;
	           }
	       }
	       return result;
	    }
}
