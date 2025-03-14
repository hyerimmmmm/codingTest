class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                answer += c;
            } else {
                c = Character.toUpperCase(c);
                answer += c;
            }
        }
        
        return answer;
    }
}