class Solution {
    public int[] solution(int n, int[] numlist) {
		int num = numlist.length;
		int count = 0;
        
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			} else {
				num--;
			}
		}
		
		int[] answer = new int[num];
		
		count = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[count] = numlist[i];
				count++;
			}
		}
        
        return answer;
    }
}