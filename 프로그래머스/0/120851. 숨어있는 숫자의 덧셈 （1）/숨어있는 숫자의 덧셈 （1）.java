class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
            answer += Character.getNumericValue(a);
        }
        
        return answer;
    }
}