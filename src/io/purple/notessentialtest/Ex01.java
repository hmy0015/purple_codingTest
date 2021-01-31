package io.purple.notessentialtest;

public class Ex01 {
	public static void main(String[] args) {
		String str = "Abracadabra"; // 임의의 글자 입력
		System.out.println(vowels(str)); // 모음 개수 구해주는 메소드 호출
	}
	
	// 모음 구분해주는 메소드
	public static int vowels(String str) {
		int vowels = 0; // 모음을 세어 줄 변수 선언
		String strArr[] = str.split(""); // 문자를 한글자씩 잘라서 배열에 담기
		
		for(int i = 0; i < strArr.length; i++) { // 배열의 크기만큼 반복
			switch(strArr[i].toLowerCase()) { // 소문자로 변환하여 비교
				case "a" : case "e" : case "i" : case "o" : case "u" :
				vowels += 1; // 모음일 경우 vowels 변수가 1씩 증가
			}
		}		
		return vowels; // 글자가 가진 모음의 개수 리턴
	}
}
