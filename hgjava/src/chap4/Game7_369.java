package chap4;

public class Game7_369 {

	public static void main(String[] args) {
		// 1~50 : 369����

		// 3, 6, 9 ���� üũ ����
		// ���� 1~50 �ݺ���
			// ���� �ڸ��� 3, 6, 9 ���� üũ
			// ���� �ڸ��� 3, 6, 9 ���� üũ
		// ������ 0 -> ����
		// ������ 1 -> ��
		// ������ 2 -> ����
		
		for(int i = 1; i <= 50; i++) {
			int count = 0;
			if((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
				count++;
			}
			if(i / 10 == 3) {
				count++;
			}
				
			switch(count) {
			case 0 : System.out.print(i + "\t"); break;
			case 1 : System.out.print("��\t"); break;
			case 2 : System.out.print("����\t"); break;	
			}
			if(i % 10 == 0) {
				System.out.println("");
			}
		}
		
		
	}	// end main

}	// end class
