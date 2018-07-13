package fizzBuzz_412;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = "";
            if ((i+1)%3 == 0){
                a[i] += "Fizz";
            }
            if ((i+1)%5 == 0){
                a[i] += "Buzz";
            }
            if (a[i].isEmpty()){
                a[i] = String.valueOf((i+1));
            }
        }

        return Arrays.asList(a);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.fizzBuzz(15).toString());
    }

}
