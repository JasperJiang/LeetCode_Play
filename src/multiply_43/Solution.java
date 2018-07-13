package multiply_43;

/**
 * Created by Jack on 2018/6/30.
 */
class Solution {
    public String multiply(String num1, String num2) {


        String[] resultArray = new String[num2.length()];
        String result;
        int i;
        int j;
        int carry = 0;

        for (i = num2.length()-1; i>=0; i--) {
            resultArray[i] = "";
            for (int k = 0; k < num2.length()-1-i; k++) {
                resultArray[i] += '0';
            }
            carry = 0;
            for (j = num1.length()-1; j >=0; j--) {
                int a = Character.getNumericValue(num2.charAt(i));
                int b = Character.getNumericValue(num1.charAt(j));


                int mult = a * b + carry;
                carry = mult/10;


                resultArray[i] += mult%10;
            }
            if (carry>0){
                resultArray[i] += carry;
            }
        }
        carry = 0;
        for (int k = 0; k < resultArray[0].length(); k++) {
            System.out.println(123);
        }

        return num1;
    }

    public static void main(String[] args) {
        String num1 = "123456789";

        String num2 = "987654321";


        Solution solution = new Solution();

        System.out.println(solution.multiply(num1, num2));
    }
}