/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given 
 * number of rows like this: (you may want to display this pattern in a 
 * fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */
public class ZigZag {
	 public String convert(String s, int numRows) {
	        if(numRows == 1 || s.length() <= numRows) return s;
	        String[] row  = new String[numRows];
	        for(int i = 0;i<numRows;i++) row[i] = "";
	        char[] S = s.toCharArray();
	        int index = 0;
	        int sign = 1;
	        for(int i = 0 ; i< S.length ; i++ ){
	            row[index] += String.valueOf(S[i]);
	            index += sign;
	            if(index == numRows-1 || index == 0) sign *= -1;
	        }
	        String result = "";
	        for(int i = 0 ; i< numRows ;i++) result += row[i];
	        return result;
	    }
}
