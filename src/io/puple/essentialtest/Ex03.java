package io.puple.essentialtest;

public class Ex03 {
	public static void main(String[] args) {
		String score[] = {"3 : 1", "2:2", "1:3", "1:0", "1:0", "1 : 4", "1: 3", "3: 0", "1:1", "4:2"}; // 점수 입력
		System.out.println(overallPoints(score)); // 승점 구하는 메소드 호출
	}
	
	// 전체 승점 구하는 메소드
	public static int overallPoints(String[] score) {
		int points = 0; // 전체 승점을 담을 변수
		String arr[] = null; // ':' 기준으로 나눈 각각의 점수를 담아줄 배열 (ex, "a:b" => ["a", "b"])
		
		for(int i = 0; i < score.length; i++) {
			arr = score[i].replaceAll(" ", "").split(":"); // ':' 기준으로 나눈 각각의 점수를 배열에 담기, 점수에 공백이 포함되어있을 경우 공백 제거
			
			if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) { // 이겼을 경우
				points += 3; // 전체 승점에 3점 더하기
			} else if(Integer.parseInt(arr[0]) == Integer.parseInt(arr[1])) { // 동점일 경우
				points += 1; // 전체 승점에 1점 더하기
			} else { // 졌을 경우
				points += 0;  // 전체 승점에 0점 더하기
			}
		}		
	    return points;
	}
}
