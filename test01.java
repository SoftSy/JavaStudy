package practice;

import java.util.*;

public class test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요:");
		
		int a = scanner.nextInt();
		
		int j = 2;
		
		boolean isPrime = false;
		
		for(j=2; j<a; j++) {
			if(a%j==0) {
				isPrime = true;
				break;
			}
		}
		if(isPrime) {
			System.out.println("소수아님");
		}
		else {
			System.out.println("소수");
		}
		
	}
}

