package io.purple.essentialtest;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		int num[] = { 0, 1, 1, 3, 5, 2, 7, 4, 5, 5, 6 }; // 임의의 배열 선언
		System.out.println(smallestUnusedNum(num));
	}

	public static int smallestUnusedNum(int[] num) {
		int count = 0; // 사용하지 않는 가장 작은 숫자를 담아줄 변수
		
		// 배열 내 중복값 제거 및 오름차순 정렬
		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			t.add(num[i]);
		}

		// 배열 내 값들을 비교하여 사용하지 않는 가장 작은 숫자 찾기
		Iterator<Integer> iter = t.iterator();
		while (iter.hasNext()) { 
			if(count != iter.next()) { // 변수 count와 배열 내 값 비교
				break; // 해당 숫자가 없을 경우 반복문 종료
			}
			count++; // 해당 숫자가 있을 경우 다음 배열 비교를 위해 count 값 증가
		}

		return count;
	}
}
