/**
 * Calculate the sum of two integers a and b, 
 * but you are not allowed to use the operator + and -.
 * 
 * Solution : carry = a&b take the both integers same bits for carry
 *            a = a^b  plus the bits where not need to be carried
 *            carry <= 1  for carry one bit
 *           Recursively until a&b == 0
 *         
 * @author caomi
 *
 */
public class SumOfTwoInteger {
	public int getSum(int a , int b){
		int result = b== 0 ? a : getSum(a^b,(a&b)<<1);
		return result;
	}

}
