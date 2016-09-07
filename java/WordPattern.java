package LeetCodeSol.java;

public class WordPattern {
	 public boolean wordPattern(String pattern, String str) {
	        char[] pt = pattern.toCharArray();
	        String[] words = new String[pt.length];
	        int[][] index = new int[26][pt.length];
	        int[]  num = new int[26];
	        int st = 0; int ed = 0;
	        int pre = -1,p=-1;
	        for(int i=0;i<pt.length;i++){
	            if(ed >= str.length() && i< pt.length) return false;
	            pre = p;
	            p = (int)(pt[i]-'a');
	            index[p][num[p]++]=i;
	            while(ed<str.length()&& str.charAt(ed)!= ' '){ed++;}
	            words[i]=str.substring(st,ed);
	            st = ed+1;
	            ed++;
	            if(num[p]>=2){
	               if(! words[index[p][num[p]-2]].equals(words[index[p][num[p]-1]]) ) return false;
	            }
	            if( pre != p && pre != -1){
	                if( words[index[p][0]].equals(words[index[pre][0]])) return false;
	            }
	        }
	        if(ed < str.length()) return false;
	        return true;
	    }
   
}
