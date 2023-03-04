package NGS.NHN.test.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 조선대학교 컴퓨터공학과 3학년 20182337 노규선
 * 
 * NHNEXAM 코드 작성
 * 
 */
public class DecimalConvertor {

	static int len;
	static int result;
	
	
	// 변환된 10진수 값을 그대로 받아서 2진수로 변환하기 위한 static 정적 변수 선언
	static int sum = 0;
	
	// 문자열 길이를 받아서 배열 크기를 선언하고, 10진수 -> 2진수 변환 메서드를 위한 변수 선언
	static String str;
	
	public static int binaryToDecimal(String binaryValue) {
		
		// int와 char 비교를 위해서 String 사용
		String numStr = binaryValue;
		StringBuffer sb = new StringBuffer(numStr);
		numStr = sb.reverse().toString();
		
		String[] ar = numStr.split("");
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <= 9; j++) {
				
				String new_str = j +"";
				
				// new_str 문자형 숫자와 ar[i]에 담긴 문자형 숫자가 일치하면 실행
				if (new_str.equals(ar[i])) {
					result = result + (j * (int)Math.pow(10, i));
				}
			}
			
		}
		// 정수형으로 변환된 숫자 result
		
		// result를 10진수로 변환하기 위한 변수 num
		int num = result;
		// 진수 변환 계산을 위한 변수들
		int i = 1;
		int index = 0;
		
		while (num > 0) {
			
			i = (int)Math.pow(2, index);
			if (num % 10 == 1) {
				sum += i;
			}   
			num /= 10;
			index++;
		}
		
		return sum;
	}
	
	public static String decimalToBinary(int binaryValue) {
		
		int inputNum = binaryValue;
		int bin[] = new int[str.length()];
		
		/*
		 * 19 / 2	9...1
		 * 9 / 2 	4...1
		 * 4 / 2	2...0
		 * 2 / 2	1...0
		 * 1 / 2	0...1
		 * 
		 * 010011 => 19
		 * 
		 */
		
		int i = 0;
		int mok = inputNum;
		
		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		
		StringBuffer n_str = new StringBuffer();
		
		for (int j = 0; j < bin.length; j++) {
			n_str.append(bin[j]);
		}
		
		return n_str.toString(); 
	}

	public static void main(String[] args) {

		System.out.print("Enter a binary Value: ");
		
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		System.out.println(binaryToDecimal(str));
		
		System.out.println(decimalToBinary(sum));
		
	}
	
	// --------------------2번
	
	
	
}


class Test {
	public static void main(String[] args) {

		
//
//		System.out.print("Enter a binary Value: ");
//		
//		Scanner sc = new Scanner(System.in);
//		str = sc.next();
//		
//		System.out.println(binaryToDecimal(str));
//		
//		System.out.println(decimalToBinary(sum));
	}

}