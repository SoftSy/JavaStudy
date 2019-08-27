/*
주어진 형태대로 높이가 N인 달팽이 사각형을 출력한다. 

입력 : 5
출력
 1  2  3  4  5 
16 17 18 19  6  
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9
 */
public class Ex01 {
	public static void main(String[] args) {
		int length = 5; int row=0; int col=-1; int sw=1; int k=0;
		int [][]arr = new int[length][length];
		while(length>0) {
			for(int i=0; i<length; i++ ) {
				col += sw;
				arr[row][col]= ++k;
			}
			
			length--;
			if(length==0) continue;
			for(int i=0; i<length; i++) {
				row +=sw;
				arr[row][col] = ++k;
			}
			
			sw *= -1;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}


