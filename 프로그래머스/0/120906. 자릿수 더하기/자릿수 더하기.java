class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = n / 100000; // 10만
        n %= 100000;
        
        int b = n / 10000; // 1만
        n %= 10000;
        
        int c = n / 1000; // 천
        n %= 1000;
        
        int d = n / 100; // 백
        n %= 100;
        
        int e = n / 10; // 십
        n %= 10;
        
        int f = n / 1; // 일
        
        answer = a + b + c + d + e + f;
        
        return answer;
    }
}