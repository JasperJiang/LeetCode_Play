package countPrimes_204;

import java.util.Arrays;

public class Solution {

    public int countPrimes(int n) {
        int count = 0;
        Boolean[] primes = new Boolean[n];
        Arrays.fill(primes,true);
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) count++;
        }

        return count;

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.countPrimes(999999));
    }

}
