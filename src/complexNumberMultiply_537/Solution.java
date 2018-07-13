package complexNumberMultiply_537;

import java.util.regex.Pattern;


// 那么它们的积(a1+a2i)(b1+b2i)=(a1b1+a2b2)+(a2b1+a1b2)i.
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        Pattern rPlus = Pattern.compile("\\+");

        Pattern rI = Pattern.compile("i");

        int a1 = Integer.parseInt(rPlus.split(a)[0]);
        int a2 = Integer.parseInt(rI.split(rPlus.split(a)[1])[0]);
        int b1 = Integer.parseInt(rPlus.split(b)[0]);
        int b2 = Integer.parseInt(rI.split(rPlus.split(b)[1])[0]);

        int real = a1*b1 - a2*b2;
        int imaginary = a2*b1 + a1*b2;
        return String.format("%d+%di",real,imaginary);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.complexNumberMultiply("1+-1i","1+-1i"));

    }
}

