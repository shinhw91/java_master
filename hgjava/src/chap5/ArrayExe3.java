package chap5;

public class ArrayExe3 {

	public static void main(String[] args) {
		String[] nameAry = {"ȫ�浿", "��浿", "�ڱ浿", "ȫ�浿", "Ȳ�浿"};
		
		String search = "ȫ�浿";
		int count = 0;
		// for�ݺ��� Ȱ��
		for(int i = 0; i < nameAry.length; i++) {
			if(nameAry[i].equals(search)) {
				count++;
			}
		}
		
		int count1 = 0;
		for(String name : nameAry) {
			if(name.equals(search)) {
				count1++;
			}
		}
			
		System.out.println(search + "�� ��" + count + "�� �Դϴ�.");
		System.out.println(search + "�� ��" + count1 + "�� �Դϴ�.");
		
		// �ִ밪 ã��
		int[] scores = {88, 68, 72, 89, 92, 70};
		int maxScore = 0;
		for(int score : scores) {
			if(score > maxScore) {
				maxScore = score;
			}
		}

		System.out.println("���� ū �� : " + maxScore);
		
	}	// end main

}	// end class
