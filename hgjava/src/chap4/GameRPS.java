package chap4;

import java.util.Scanner;

public class GameRPS {

	public static void main(String[] args) {
		// ����, ����, �� ����
		
		int computer = (int)(Math.random()*2);
		Scanner sc = new Scanner(System.in);
		int human = sc.nextInt();
		if(computer == human) {
			System.out.println("�����");
		}
		

	}

}
