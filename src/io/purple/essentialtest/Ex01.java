package io.purple.essentialtest;

public class Ex01 {
	public static void main(String[] args) {
		int month = 4; // 월
		System.out.println(quarterYear(month) + "분기"); // 분기 출력
	}
	
	// 분기 구하는 메소드
	public static int quarterYear(int month) {
		// 3으로 나누었을 때 나머지가 있는 숫자의 분기 출력을 위해 Math.ceil 함수 사용
	    return (int)Math.ceil(month/3.0); // 정수형으로 리턴하기 위해 강제형변환 해줌
	}
}