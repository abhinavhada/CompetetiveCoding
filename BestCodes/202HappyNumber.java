class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        int slow = n;
        int fast = digitSquareSum(n);  // setting fast to n would cause an immediate `slow == fast` collision

        while (fast != 1 && slow != fast) {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        }

        return fast == 1;
    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
