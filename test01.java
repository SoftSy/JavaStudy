package practice;

import java.util.*;

public class test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���:");
		
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
			System.out.println("�Ҽ��ƴ�");
		}
		else {
			System.out.println("�Ҽ�");
		}
		
	}
}

