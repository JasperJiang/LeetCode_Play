import java.util.HashMap;
import java.util.Map;

/**
 * t 楼层， n蛋数
 * Max{M(K-1, N-1), M(T-K, N)} + 1 = MK(T,N)    1=<K<T
 * Mk = Min{M1(T,N), M2(T,N), M3(T,N) ....}
 */


public class _other_TwoEggProblem {
    Map<String, Integer> cache = new HashMap<>();

    public int getResult(int t, int n){
        String key = t + "_" + n;
        if (cache.containsKey(key)){
            return cache.get(key);
        }
        if (1 == t){
            cache.put(key, 1);
            return 1;
        }

        if (1 == n){
            cache.put(key, t);
            return t;
        }

        if (0 == t){
            cache.put(key, 0);
            return 0;
        }

        int minK = Integer.MAX_VALUE;
        for (int k = 1; k < t; k++){
            int tmp = Math.max(getResult(k - 1, n-1), getResult(t - k, n)) + 1;
            minK = Math.min(minK, tmp);
        }
        cache.put(key, minK);
        return minK;

    }

    public static void main(String[] args) {
        _other_TwoEggProblem otherTwoEggProblem = new _other_TwoEggProblem();
        System.out.printf(String.valueOf(otherTwoEggProblem.getResult(50,10)));
    }


}
