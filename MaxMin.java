package practice;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		int j = 1;
		
		for(int i=0; i<num.length; i++){
			   num[i] = scanner.nextInt(); //입력받은 수를 배열에 저장
			   System.out.println((i+1) + "번째 수: " + num[i]); 
			   //입력받은 수가 몇 번째에 저장되었는지 출력
		System.out.println("넘버맥스"+num[max]);
			   if(num[max]<num[i]){
			    max=i;
			    j=i+1;
			   }   
		}	  
			  
			  System.out.println("최대값 " + num[max] +"(은/는) " + j + "번 째 숫자다.");
	}

}
