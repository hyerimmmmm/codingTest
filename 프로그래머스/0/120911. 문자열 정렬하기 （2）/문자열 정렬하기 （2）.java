import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = new char[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            c[i] = Character.toLowerCase(my_string.charAt(i));
        }
        
        Arrays.sort(c);
        
        for (int i = 0; i < c.length; i++) {
            answer += c[i];
        }
        
        return answer;
    }
}