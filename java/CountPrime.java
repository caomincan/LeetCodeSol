
public class CountPrime {	
	public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // init
        for(int i = 0 ; i< n; i++){
            isPrime[i] = true;
        }
        // remove
        for(int i = 2; i*i < n;i++){
            if(!isPrime[i]) continue;
            for(int j = i*i;j<n;j+=i){
                isPrime[j] = false;
            }
        }
        // count
        int count = 0;
        for(int i = 2; i< n;i++){
            if(isPrime[i]) count++;
        }
        return count;
    }
}
