package practice;

import java.util.*;

public class Divisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���:");
		
		int b = scanner.nextInt();
		int i;
		for(i=1; i<=b; i++){
            if((b%i)==0){
                System.out.println(i);
                
            }
	
		}
	}	

}
