class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = myString.toLowerCase();
        if (a.contains(pat.toLowerCase())) {
            answer = 1;
        }
        
        return answer;
    }
}