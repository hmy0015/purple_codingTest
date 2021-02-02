package io.purple.essentialtest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		int num = 325; // 임의의 숫자 입력
		System.out.println(fruitCode(num)); // 과일코드 출력 함수 호출
	}

	// 과일코드 출력 메소드
	public static String fruitCode(int num) throws IOException {
		// 1. 버퍼를 이용하여 메모장에 있는 과일코드 불러와서 공백 기준으로 배열에 담기
		// 2. "-" 단위로 문자열을 자르고 앞에 있는 숫자는 key, 뒤에 있는 값은 value로 맵에 담기
		// 3. 과일코드가 출력될 때까지 연산하는 코드 작성 (입력된 숫자 - 자릿수합이 100이하가 될 때까지 무한루프)

		InputStream in = new FileInputStream("../purpleIo_coding_test/fruit_code.txt"); // 파일 불러오기
		InputStreamReader ir = new InputStreamReader(in, "UTF-8"); // 파일 형식에 맞춰 인코딩
		BufferedReader br = new BufferedReader(ir); // 인코딩 된 파일 버퍼에 담기
		Map<String, String> fCode = new HashMap<String, String>(); // 과일코드를 담아줄 맵 생성

		while (true) {
			try {
				String[] str = br.readLine().split(" "); // 메모장의 과일코드를 공백 기준으로 배열에 담기
				str = str[0].split("-"); // 배열 안의 과일코드를 "-"기준으로 나눠 담기
				fCode.put(str[0], str[1]); // 앞에 있는 숫자는 key, 뒤에 있는 값은 value로 맵에 담기
			} catch (NullPointerException e) { // null 값이 발생할 경우 반복문 종료
				break;
			}
		}
		
		// result -> 자릿수합을 담아줄 변수, tmp = 입력받은 숫자를 담아줄 변수
		int result = 0, tmp = num;
		
		while(tmp > 100 || tmp >= 10) { // 입력된숫자값이 10 이상이거나 (입력된숫자-자릿수합)이 100 이하가 될 때까지 무한루프
			while(tmp != 0) { // 자릿수합 구하는 연산 반복문 (입력받은 숫자가 0이 될 때까지 반복)
				result += (tmp % 10); // 10으로 나눈 나머지를 합에 더하기
				tmp -= (tmp % 10); // 10으로 나눈 나머지를 입력받은 숫자에서 빼기
				tmp /= 10; // 입력받은 숫자를 10으로 나눠서 자릿수 줄이기
			}
			tmp = num - result; // tmp에 (입력받은숫자-자릿수합) 값 넣기
		}
		
		br.close(); // 버퍼 닫기

		return fCode.get(Integer.toString(tmp)); // 과일코드 리턴, 과일코드의 키값이 String 형태로 저장되어있기 때문에 tmp를 강제형변환 하여 코드를 불러옴
	}
}
