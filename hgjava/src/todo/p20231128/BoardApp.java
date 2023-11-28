package todo.p20231128;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		boolean run = true;
		Board[] boards = new Board[100];
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.등록 2.목록 3.상세조회 4.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.println("<게시글 등록>");
				System.out.print("번호 : ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("작성자 : ");
				String writer = sc.nextLine();
				System.out.print("내용 : ");
				String contents = sc.nextLine();
				System.out.print("작성일시 : ");
				String date = sc.nextLine();

				Board board = new Board(number, title, writer, contents, date);

				for(int i = 0; i < boards.length; i++) {
					if(boards[i] == null) {
						boards[i] = board;
						break;
					}
				}
				break;
				
			case 2 : 
				for(int i = 0; i < boards.length; i++) {
					if(boards[i] != null) {
						boards[i].showList();
					}
				}
				break;
				
			case 3 :
				System.out.println("상세조회 게시글 번호 : ");
				number = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < boards.length; i++) {
					if(boards[i] != null && boards[i].getBoardNum() == number) {
						boards[i].showAllInfo();
					}
				}
				break;
				
			case 4 :
				System.out.println("프로그램을 종료합니다");
				run = false;
				
				
			}	// end switch
		}	// end while

	}	// end main

}	// end class
