package practice;

public class TextOrNumber {
 //문자열인지 숫자인지 판별하는 프로그램
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if(!('0'<=ch && ch<='9')) {
				isNumber = false;
				break;
			}
			
		}
		if(isNumber) {
			System.out.println("숫자 입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
