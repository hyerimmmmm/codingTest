class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                String j = strArr[i].toLowerCase();
                answer[i] = j;
            } else {
                String j = strArr[i].toUpperCase();
                answer[i] = j;
            }
        }
        return answer;
    }
}