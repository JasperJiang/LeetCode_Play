package FindOne;

public class Solution {

    public int solution(int a,int b){
        int tmp = a*b;
        int result = 0;
        String str = Integer.toBinaryString(tmp);
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '1'){
                result++;
            }
        }

        return result;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(100000000,100000000));
    }
}
