package practice;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		int j = 1;
		
		for(int i=0; i<num.length; i++){
			   num[i] = scanner.nextInt(); //�Է¹��� ���� �迭�� ����
			   System.out.println((i+1) + "��° ��: " + num[i]); 
			   //�Է¹��� ���� �� ��°�� ����Ǿ����� ���
		System.out.println("�ѹ��ƽ�"+num[max]);
			   if(num[max]<num[i]){
			    max=i;
			    j=i+1;
			   }   
		}	  
			  
			  System.out.println("�ִ밪 " + num[max] +"(��/��) " + j + "�� ° ���ڴ�.");
	}

}
