package io.puple.notessentialtest;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int num[] = { 0,1,2 }; // 임의의 배열 선언
		System.out.println(middleNumSearch(num)); // 중간 숫자 찾기 메소드 호출
	}
	
	// 중간 숫자 찾기 메소드
	public static int middleNumSearch(int[] num) {
		Arrays.sort(num); // 배열 안의 숫자를 오름차순 정렬
		int middleNum = num[1]; // 중간값 변수에 담기
		
		return middleNum;
	}
}
