package practice;

public class Pibonachi {

	public static void main(String[] args) {
		//�Ǻ���ġ ù �� ���ڴ� 1,1�� ���Ѵ�.
		int num=1;
		int num2=1;
		int num3=0; //����°��
		System.out.print(num+","+num2);
		for(int i=0; i<8; i++) {
			num3=num+num2; //�� �� ° �� �� ù �� ° �� �� �� ° �� �� �� �� �� �� �� ��
			System.out.print(","+num3); //������ ���� ���
			num=num2; //�� �� ° �� �� �� ù �� ° �� �� �� �� ��
			num2=num3; //�� �� ° �� �� �� �� �� ° �� �� �� �� ��
		}
	}

}
