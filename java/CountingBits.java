package LeetCodeSol.java;
/**
 * Given a non negative integer number num. For every numbers i in the range 0 ¡Ü i ¡Ü num calculate 
 * the number of 1's in their binary representation and return them as an array.
 *
 * The bits grows regularly based on 2 bits carry
 *
 * @author caomi
 *
 */
public class CountingBits {
	public int[] countBits(int num) {
        int[] result = new int[num+1];
        int count = 1;
        int range = 1;
        while(count <= num){
            for(int i=0; i<range/2 && count<=num ;i++){
                result[count] = result[count-range/2]+1;
                count++;
            }
            range *= 2;
        }
        return result;
    }
}
