class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;
        for(int i=digits.length-1;i>=0;i--){
            sum = digits[i] + carry;
            carry = sum/10;
            sum = sum%10;
            digits[i] = sum;
        }
        if(carry !=0){
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for(int i=0;i<digits.length;i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}