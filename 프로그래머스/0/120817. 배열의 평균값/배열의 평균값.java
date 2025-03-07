
class Solution {
    public double solution(int[] numbers) {
    double num = 0;
        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        num /= numbers.length;
        double answer = num;
        return answer;
    }
}