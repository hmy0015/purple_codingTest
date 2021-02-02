package io.purple.notessentialtest;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		int num[] = { 1, 15, 12};
		System.out.println(checkOddEven(num));
	}
	
	public static int checkOddEven(int[] num) {
		ArrayList<Integer> testEven = new ArrayList<Integer>(); // 각 짝수들의 위치를 담을 리스트
		ArrayList<Integer> testOdd = new ArrayList<Integer>(); // 각 홀수들의 위치를 담을 리스트
		int oddEvenLocation = 0; // 홀수 또는 짝수중에 하나만 존재하는 값의 위치를 담을 리스트
		
		// 홀수와 짝수를 분리하여 각 숫자의 '배열 내 위치'를 리스트에 담기 (값이 아님 / ex : 입력된 값이 {1, 15, 12} 라면 홀수 리스트에는 {0,1}, 짝수 리스트에는 {2}가 들어감)
		for(int i = 0; i < num.length; i++) { // 입력된 숫자만큼 반복
			if(num[i] > 0) { // 0과 음수는 제외
				if((num[i] % 2) == 0) { // 짝수일 경우
					testEven.add(i); // 해당 숫자의 위치를 리스트에 담기
				}
				else if((num[i] % 2) != 0) { // 홀수일 경우
					testOdd.add(i); // 해당 숫자의 위치를 리스트에 담기
				}
			}
		}
		
		if(testOdd.size() > testEven.size()) { // 짝수가 1개일 경우
			oddEvenLocation = testEven.get(0); // 해당 숫자의 배열 내 위치를 변수에 담기
		}else { // 홀수가 1개일 경우
			oddEvenLocation = testOdd.get(0); // 해당 숫자의 배열 내 위치를 변수에 담기
		}
		
		return oddEvenLocation + 1; // 배열은 0부터 시작하지만, 숫자의 위치는 1부터 시작해야하기 때문에 +1 해줘야 함
	}
}