class Solution {
    public int solution(int n, int k) {
        int money = 0;
        if (n >= 10) {
            money = (12000 * n) + (2000 * k) - (2000 * (n / 10));
        } else {
            money = (12000 * n) + (2000 * k);
        }
        return money;
    }
}