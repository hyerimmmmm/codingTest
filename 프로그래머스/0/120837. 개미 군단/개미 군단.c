#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    int aAnt = 5; // 장군개미
		int bAnt = 3; // 병정개미
		int cAnt = 1; // 일개미
		
		int aAntCount; // 장군개미 숫자
		int bAntCount; // 병정개미 숫자
		int cAntCount; // 일개미 숫자
    
    aAntCount = hp / aAnt;
		bAntCount = (hp % aAnt) / bAnt;
		cAntCount = ((hp % aAnt) % bAnt) / cAnt;
    
    answer = aAntCount + bAntCount + cAntCount;
    
    return answer;
}