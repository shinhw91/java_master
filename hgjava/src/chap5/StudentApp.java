package chap5;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		String[] names = null;
		
		// 1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����, ���) 5.����
		boolean run = true;
		while(run) {
			System.out.println("1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����, ���) 5.����");
			int menu = sc.nextInt();	// Enter �ձ��� ó��
			sc.nextLine();	// Enter ó��
			
			switch(menu) {
			case 1 : 
				System.out.println("�л����Է�>>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				names = new String[studentNum];
				break;
			case 2 :
				System.out.println("�����Է�>>");
				// for �ݺ�
				for(int i = 0; i < scores.length; i++) {
					System.out.print("name[" + i + "]>> ");
					names[i] = sc.nextLine();
					System.out.print("scores[" + i + "]>> ");
					scores[i] = sc.nextInt();
					sc.nextLine();
				}
				break;
			case 3 :
				System.out.println("������>>");
				for(int i = 0; i < scores.length; i++) {
					System.out.print("�̸��� " + names[i] + ", ������ " + scores[i] + "\n");
				}
				break;
			case 4 :
				System.out.println("�м�>>");
				// �ְ����� ���
				int maxScore = 0;
				String maxName = "";
				double avg = 0;
				int sum = 0;
				
//				for(int score : scores) {
//					sum += score;
//					if(score > maxScore) {
//						maxScore = score;
//					}
//				}
				
				int score = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += score;	// sum = sum + score;
					if(scores[i] > maxScore) {
						maxScore = scores[i];
						maxName = names[i];
					}
				}
				
				avg = sum * 1.0 / scores.length;
				System.out.println(maxName + "�ְ����� : " + maxScore + ", ��� : " + avg);
				break;
			case 5 :
				System.out.println("����>>");
				run = false;
				break;
			}	// end of switch
		}	// end of while
		System.out.println("end of prog");
		
	}	// end main

}	// end class
