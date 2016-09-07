package LeetCodeSol.java;

public class ReverseVovel {
	  public String reverseVowels(String s) {
	        char[] tmp = s.toCharArray();
	        int p1=0; int p2 = tmp.length-1;
	        while(p1<p2){
	           while(!isVowel(tmp[p1]) && p1<tmp.length-1){p1++;}
	           while(!isVowel(tmp[p2]) && p2>0){p2--;}
	           if(p1<p2) swap(tmp,p1++,p2--);
	        }
	        return String.valueOf(tmp);
	    }
	    boolean isVowel(char c){
	        if(c == 'a'|| c == 'e' || c== 'i' || c=='o' || c=='u' || c== 'A' || c=='E'|| c=='I'||c=='O'|| c=='U')
	             return true;
	        else
	             return false;
	    }
	    void swap(char[] array,int i, int j){
	        char tmp = array[i];
	        array[i]=array[j];
	        array[j]=tmp;
	    }
}
