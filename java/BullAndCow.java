package Leetcode;

public class BullAndCow {
    public String getHint(String secret, String guess) {
        int bull =0;
        int cow = 0;
        int[] shash = new int[10];
        int[] ghash = new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.substring(i,i+1).equals(guess.substring(i,i+1))){
                bull++;
            } else{
                int g = Integer.valueOf(guess.substring(i,i+1));
                int s = Integer.valueOf(secret.substring(i,i+1));
                ghash[g]++;
                shash[s]++;
            }
        }  
        for(int i =0;i<10;i++)
          if(ghash[i]>=1 && shash[i]>=1) cow += Math.min(shash[i],ghash[i]);

        return String.valueOf(bull)+"A"+String.valueOf(cow)+"B";
    }

}
