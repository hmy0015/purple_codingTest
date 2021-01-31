package io.purple.notessentialtest;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		String name[] = {"Ryan", "Kieran", "Mark", "Roy"}; // 임의의 글자 입력
		System.out.println(friend(name)); // 4글자의 이름을 가진 친구를 찾는 메소드 호출
	}
	
	// 4글자의 이름을 가진 친구를 찾는 메소드
	public static ArrayList<String> friend(String[] name) {
		ArrayList<String> friend = new ArrayList<String>(); // 친구의 이름을 담아서 리턴해줄 리스트 생성
		
		for(int i = 0; i < name.length;i++) { // 입력받은 이름의 개수만큼 반복
			if(name[i].length() == 4) { // 이름이 4글자인 경우
				friend.add(name[i]); // 리스트에 담기
			}
		}
		return friend; // 리스트 리턴
	}
}
