package chap5;

import java.util.Scanner;

public class StudentApp2 {
	static Scanner sc = new Scanner(System.in);
	static Student[] students = null;
	
	
	public static void addStudent() {
		System.out.println("�л����� �Է�>> ");
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.print("�л� �̸� �Է�>> ");
			student.name = sc.nextLine();
			System.out.print("�л� ���� �Է�>> ");
			student.score = Integer.parseInt(sc.nextLine());
			System.out.print("��/�� �Է�>> ");
			student.gender = sc.nextLine();
			
			students[i] = student;
		}		
	}	// end addStudent

	
	public static void searchStudent() {
		System.out.println("��ȸ�� �̸��Է�>> ");
		String name = sc.nextLine();
		boolean exists = false;
		
		// �л��̸� - ���� ���
		for(Student stu : students) {
			if(name.equals(stu.name)) {
				System.out.println("�̸��� " + stu.name + ", ������ " + stu.score);
				exists = true;
			}
		}
		
		// ã�� �̸��� ���翩�� : exists Ȯ��
		if(!exists) {
			System.out.println("ã�� �̸��� �����ϴ�");
		}
		
//		for(int i = 0; i < students.length; i++) {
//			System.out.println(students[i].name + " - " + students[i].score);
//		}
//		break;
		
	}	// end searchStudent
	
	
	public static void analysis() {
		int sumOfMen = 0, cntOfMen = 0;
		int sumOfWomen = 0, cntOfWomen = 0;
		for(Student stu : students) {
			if(stu.gender.equals("��")) {
				sumOfMen += stu.score;
				cntOfMen++;
			} else if (stu.gender.equals("��")) {
				sumOfWomen += stu.score;
				cntOfWomen++;
			}
		}
		System.out.println("���л��� ��� : " + (sumOfMen * 1.0 / cntOfMen));
		System.out.println("���л��� ��� : " + (sumOfWomen * 1.0 / cntOfWomen));
		
	}	// end analysis
	
	
	public static void modify() {
		// �̸��Է� -> ��������
		System.out.println("��ȸ�� �̸��Է�>> ");
		String name = sc.nextLine();
		boolean exists = false;

		for(int i = 0; i < students.length; i++) {
			// �����߰� => �������� �Է�
			if(name.equals(students[i].name)) {
				System.out.println("�������� �Է�>>");
				students[i].score = Integer.parseInt(sc.nextLine());
				exists = true;
			}
		}
		if(!exists) {
			System.out.println("ã�� �̸��� �����ϴ�");
		}

	}	// end modify
	
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		
		while(run) {
			System.out.println("1.�л��� 2.�����Է� 3.��ȸ 4.�м�(�ְ�����, ���) 5.���� 6.����");
			int menu = sc.nextInt();	// Enter �ձ��� ó��
			sc.nextLine();	// Enter ó��

			switch(menu) {
			case 1 : 
				System.out.println("�л��� �Է�>> ");
				studentNum = Integer.parseInt(sc.nextLine());	// ���ڿ� ����ȯ
				students = new Student[studentNum];
				break;
			case 2 :
				addStudent();
				break;
			case 3 :
				searchStudent();
				break;
			case 4 :	// �м�
				analysis();
				break;
			case 5 :	// ����
				modify();
				break;
			case 6 :
				System.out.println("�����մϴ�.");
				run = false;
				
			}	// end switch

		}	// end while
		
	}	// end main
}	// end class
