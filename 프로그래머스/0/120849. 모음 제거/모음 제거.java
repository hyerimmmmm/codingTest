class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (a != 'u' && a != 'i' && a != 'o' && a != 'a' && a != 'e') {
                answer += a;
            }
        }
        
        return answer;
    }
}