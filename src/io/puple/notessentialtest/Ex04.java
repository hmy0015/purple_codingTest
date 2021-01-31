package io.puple.notessentialtest;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		int num[] = {2, 15, 12};
		System.out.println(checkOddEven(num));
	}
	
	public static int checkOddEven(int[] num) {
		ArrayList<Integer> even = new ArrayList<Integer>(); // 짝수를 담아줄 리스트 생성
		ArrayList<Integer> odd = new ArrayList<Integer>(); // 홀수를 담아줄 리스트 생성
		int oddEvenLocation = 0; // 홀수 또는 짝수의 '위치'를 담아줄 변수
		int oddEvenValue = 0; // 홀수 또는 짝수 중 하나만 존재하는 '값'을 담아줄 변수
		
		// 1. 홀수와 짝수 분리하여 리스트에 담기
		for(int i = 0; i < num.length; i++) { // 입력된 숫자만큼 반복
			if(num[i] > 0) { // 0과 음수는 제외
				if((num[i] % 2) == 0) { // 짝수일 경우
					even.add(num[i]); // 짝수 리스트에 담기
				}
				else if((num[i] % 2) != 0) { // 홀수일 경우
					odd.add(num[i]); // 홀수 리스트에 담기
				}
			}
		}
		
		// 2. 분리된 홀수 또는 짝수 중 하나만 존재하는 값을 따로 담아주기
		if(odd.size() == 1) { // 홀수가 1개일 경우
			oddEvenValue = odd.get(0);
		}else { // 짝수가 1개일 경우
			oddEvenValue = even.get(0);
		}

		// 3. 홀수 또는 짝수 중 하나만 존재하는 값의 순번 찾기		
		for(int j = 0; j <= num.length; j++) {
			if(num[j] == oddEvenValue) { 
				oddEvenLocation = j + 1; // 위치 담기
				break;
			}
		}
		
		return oddEvenLocation;
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	// 규칙을 추가한 메소드
	// 1. 입력된 숫자가 0 또는 음수만 있을 경우, 정수를 입력하라는 문구 출력
	// 2. 짝수와 홀수의 개수가 같을 경우, 가장 작은 짝수와 홀수를 각각 출력
	// 3. 짝수의 개수가 홀수보단 적지만 2개 이상일 경우, 가장 작은 짝수를 출력
	// 4. 홀수의 개수가 짝수보단 적지만 2개 이상일 경우, 가장 작은 홀수를 출력
	
	public static String checkForOddEven(int[] num) {
		ArrayList<Integer> even = new ArrayList<Integer>(); // 짝수를 담아줄 리스트 생성
		ArrayList<Integer> odd = new ArrayList<Integer>(); // 홀수를 담아줄 리스트 생성
		int oddEvenLocation = 0; // 홀수 또는 짝수의 '위치'를 담아줄 변수
		int oddEvenValue = 0; // 홀수 또는 짝수 중 하나만 존재하는 '값'을 담아줄 변수
		
		// 1. 홀수와 짝수 분리하여 리스트에 담기
		for(int i = 0; i < num.length; i++) { // 입력된 숫자만큼 반복
			if(num[i] > 0) { // 0과 음수는 제외
				if((num[i] % 2) == 0) { // 짝수일 경우
					even.add(num[i]); // 짝수 리스트에 담기
				}
				else if((num[i] % 2) != 0) { // 홀수일 경우
					odd.add(num[i]); // 홀수 리스트에 담기
				}
			}
		}
		
		// 2. 분리된 홀수 또는 짝수 중 하나만 존재하는 값을 따로 담아주기
		if(odd.size() == 1) { // 홀수가 1개일 경우
			oddEvenValue = odd.get(0);
		}else { // 짝수가 1개일 경우
			oddEvenValue = even.get(0);
		}

		// 3. 홀수 또는 짝수 중 하나만 존재하는 값의 순번 찾기		
		for(int j = 0; j <= num.length; j++) {
			if(num[j] == oddEvenValue) { 
				oddEvenLocation = j + 1; // 홀수가 있는 위치 담기
				break;
			}
		}
		
		return Integer.toString(oddEvenLocation);
	}
}