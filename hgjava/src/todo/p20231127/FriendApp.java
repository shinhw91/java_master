package todo.p20231127;
	// ģ���� ������ 1.ģ���� 2.�Է� 3.��� 4.���� 5.���� (FriendApp)

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		boolean run = true;
		int friendNum = 0;
		Friend[] friends = null;
		
		while(run) {
			System.out.println("1.ģ���� 2.�Է� 3.��� 4.���� 5.����");
			Scanner sc = new Scanner(System.in);
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 : 
				System.out.print("ģ���� �Է� : ");
				friendNum = Integer.parseInt(sc.nextLine());
				friends = new Friend[friendNum];
				break;
				
			case 2 :
				System.out.println("<ģ������ �Է�>");
				for(int i = 0; i < friends.length; i++) {
					Friend friend = new Friend();
					System.out.print("�̸� : ");
					friend.name = sc.nextLine();
					System.out.print("����ó : ");
					friend.tel = sc.nextLine();
					System.out.print("������ : ");
					friend.blood = sc.nextLine();

					friends[i] = friend;
				}
				break;
				
			case 3 :
				System.out.println("<��� ���>");
				for(int i = 0; i < friends.length; i++) {
					System.out.println("�̸� : " + friends[i].name + ", ����ó : " + friends[i].tel + ", ������ : " + friends[i].blood);
				}
				break;
				
			case 4 :
				System.out.print("��ȸ�� �̸� �Է� : ");
				String name = sc.nextLine();
				boolean exists = true;
				
				for(int i = 0; i < friends.length; i++) {
					if(name.equals(friends[i].name)) {
						System.out.print("���� ����ó �Է� : ");
						friends[i].tel = sc.nextLine();
						exists = false;
					}
				}
				if(exists) {
					System.out.println("ã�� �̸��� �����ϴ�");
				}
				break;
				
			case 5 :
				System.out.println("end of prog");
				run = false;

				
				
			}	// end switch
		}	// end while
		
	}	// end main

}	// end class
