package practice;

public class Pibonachi {

	public static void main(String[] args) {
		//피보나치 첫 두 숫자는 1,1로 정한다.
		int num=1;
		int num2=1;
		int num3=0; //세번째값
		System.out.print(num+","+num2);
		for(int i=0; i<8; i++) {
			num3=num+num2; //세 번 째 값 은 첫 번 째 와 두 번 째 값 을 더 해 서 얻 는 다
			System.out.print(","+num3); //세번 수열 출력
			num=num2; //두 번 째 수 열 을 첫 번 째 값 으 로 한 다
			num2=num3; //세 번 째 수 열 을 두 번 째 값 으 로 한 다
		}
	} //출력 :1,1,2,3,5,8,13,21,34,55

}
