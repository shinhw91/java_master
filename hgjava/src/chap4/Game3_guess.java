package chap4;

import java.util.Scanner;

public class Game3_guess {

	public static void main(String[] args) {
		// ���� ���� ����
		
		int computer = (int)(Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int myNum = sc.nextInt();
			if(myNum == computer) {
				System.out.println("�����մϴ�!!");
				break;
			}
			if(myNum > computer) {
				System.out.println("down�ϼ���!!");
			} else {
				System.out.println("up�ϼ���!!");
			}
		}
		
		sc.close();
		

	}	// end main

}	// end class
