
public class AddBinary {
	public String addBinary(String a, String b) {
        int maxLength = a.length() > b.length() ? a.length() : b.length();
        // make two strings' length equal, add 0 in the front of the shorter string
        if(maxLength != a.length()){
            int rest = maxLength - a.length();
            for(int i=0; i< rest ;i++) {
                a = "0"+a;
            }
        }
        if(maxLength != b.length()){
            int rest = maxLength - b.length();
            for(int i = 0 ; i< rest ; i++ ){
                b = "0" + b;
            }
        }
        // Adding
        int carry = 0;
        String result = "";
        for(int j = maxLength -1 ; j>=0; j--){
           int addValue = (int)(a.charAt(j)-'0')+ (int)(b.charAt(j)-'0') + carry;
           if(addValue >= 2){
               addValue -= 2;
               carry = 1;
           } else if(carry>= 1){
               carry = 0;
           }
           result = String.valueOf((char)(addValue+'0')) + result;
        }
        if(carry > 0) result = "1" + result;
        return result;
    }
}
