class Solution {
    public int reverse(int x) {
        long reversed = 0;
        int num = x;

        while (num != 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;

            num = num / 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        }


        return (int)reversed;
    }
}