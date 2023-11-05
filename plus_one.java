//PLUS_ONE
class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i] = digits[i] + carry;
            if (result[i] > 9) {
                carry = 1;
                result[i] = 0;
            } else {
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            for (int i = 1; i < newResult.length; i++) {
                newResult[i] = result[i - 1];
            }
            result = newResult;
        }

        return result;
    }
}