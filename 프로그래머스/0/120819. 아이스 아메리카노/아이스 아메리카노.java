class Solution {
    public int[] solution(int money) {
        int count = 0;
        int chMoney = 0;
        
        count = money / 5500;
        chMoney = money % 5500;
        
        int[] answer = {count, chMoney};
        return answer;
    }
}