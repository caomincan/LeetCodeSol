package LeetCodeSol.java;
/**
 * 
 * Solution same as hashmap but i could use array instead. To count the number of letters in the 
 * margazine string. The ransomNote could only contains inside magazine
 * 
 * @author caomi
 *
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        char[] source = magazine.toCharArray();
        char[] target = ransomNote.toCharArray();
        int[] characters = new int[26];
        for(int i=0;i< source.length;i++){
            int index = (int)(source[i]-'a');
            characters[index]++;
        }
        for(int i=0;i<target.length;i++){
            int index = (int)(target[i]-'a');
            characters[index]--;
            if(characters[index]<0) return false;
        }
        return true;
    }

}
