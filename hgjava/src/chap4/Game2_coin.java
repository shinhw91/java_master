package chap4;

import java.util.Scanner;

public class Game2_coin {

	public static void main(String[] args) {
		// ���� ��ȯ ���α׷�
		// Game7_369 ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("##��ȯ�� �ݾ� : ");
		int money = sc.nextInt();
		
		System.out.printf("500��¥�� : %d�� \n", money / 500);
		int remoney = money % 500;
		System.out.printf("100��¥�� : %d�� \n", remoney / 100);
		remoney = remoney % 100;
		System.out.printf("50��¥�� : %d�� \n", remoney / 50);
		remoney = remoney % 50;
		System.out.printf("10��¥�� : %d�� \n", remoney / 10);
		remoney = remoney % 10;
		System.out.printf("��ȯ �ݾ� : %d�� \n", money - remoney);
		System.out.printf("���� �ݾ� : %d�� \n", remoney);
		
//		int coin500 = 0;
//		int coin100 = 0;
//		int coin50 = 0;
//		int coin10 = 0;
	
//		coin500 = money / 500;
//		coin100 = (money % 500) / 100;
//		coin50 = (money % 500 % 100) / 50;
//		coin10 = (money % 500 % 100 % 50) / 10;
		
//		System.out.printf("500��¥�� : %d�� \n", coin500);
//		System.out.printf("100��¥�� : %d�� \n", coin100);
//		System.out.printf("50��¥�� : %d�� \n", coin50);
//		System.out.printf("10��¥�� : %d�� \n", coin10);
//		System.out.printf("��ȯ �ݾ� : %d�� \n", (coin500*500) + (coin100*100) + (coin50*50) + (coin10*10));
//		System.out.printf("���� �ݾ� : %d�� \n", money - ((coin500*500) + (coin100*100) + (coin50*50) + (coin10*10)));
		
		sc.close();

	}	// end main

}	// end class
