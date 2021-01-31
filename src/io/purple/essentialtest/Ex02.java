package io.purple.essentialtest;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		int num[] = { 0, 1, 1, 2, 4, 5, 5, 6 }; // 임의의 배열 선언
		System.out.println(smallestUnusedNum(num));
	}

	public static int smallestUnusedNum(int[] num) {
		int foo = 0; // 사용하지 않는 가장 작은 숫자를 담아줄 변수
		
		// 배열 내 중복값 제거 및 정렬
		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			t.add(num[i]);
		}

		// 중복값이 제거된 값들을 배열에 다시 담기
		Iterator<Integer> iter = t.iterator();
		while (iter.hasNext()) {
			for (int j = 0; j < t.size(); j++) {
				num[j] = iter.next();
			}
		}

		// 사용하지 않는 가장 작은 숫자 찾기
		for (int k = 0; k < num.length; k++) {
			if (k != num[k]) {
				foo = k;
				break;
			} else if (k == num.length && k == num[k]) {
				foo = k + 1;
				break;
			}
		}
		return foo;
	}
}
