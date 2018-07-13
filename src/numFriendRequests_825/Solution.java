package numFriendRequests_825;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int numFriendRequests(int[] ages) {

        Map<Integer,Integer> maps = new HashMap<>();
        int len = ages.length;
        int count = 0;

        for (int a = 0; a < len; a++) {
            if (maps.containsKey(ages[a])){
                count += maps.get(ages[a]);
                continue;
            }

            int sum = 0;
            for (int b = 0; b < len; b++) {
                if ((a == b) || (ages[b]<=0.5 * ages[a]+7) ||(ages[b]>ages[a])||(ages[b]>100 && ages[a]<100)) continue;
                sum++;
            }
            maps.put(ages[a],sum);
            count += sum;
        }

        return count;
    }




    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {20,30,100,110,120};


        System.out.println(s.numFriendRequests(a));
    }
}
