class Solution {
    public int solution(int price) {
        double answer = 0;
        
        if (price >= 100000 && price < 300000) {
            answer = price * 0.95;
        } else if (price >= 300000 && price < 500000) {
            answer = price * 0.9;
        } else if (price >= 500000) {
            answer = price * 0.8;
        } else if (price < 100000) {
            answer = price;
        }
        return (int) answer;
    }
}