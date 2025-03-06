#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int t) {
    int answer = 0;
    int mul = n; // 1시간 세균

		for (int i = t; i > 0; i--) {
			mul *= 2;
		}
    answer = mul;
    return answer;
}