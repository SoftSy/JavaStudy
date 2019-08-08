public class Shuffle {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;           //배열을 0~9 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) { //100번 섞는다.
			int n = (int)(Math.random()*10); //n=0~9까지 랜덤숫자얻기
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]); //섞은거 출력
		}
		
	}

}
