package todo.p20231128;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		boolean run = true;
		Board[] boards = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.등록 2.목록 3.상세조회 4.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.println("<게시글 등록>");
				System.out.println("번호 : ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.println("제목 : ");
				String title = sc.nextLine();
				System.out.println("작성자 : ");
				String writer = sc.nextLine();
				System.out.println("내용 : ");
				String contents = sc.nextLine();
				System.out.println("작성일시 : ");
				String date = sc.nextLine();
				
				Board board = new Board(number, title, writer, contents, date);
				
				for(int i = 0; i < boards.length; i++) {
					boards[i] = board;
					
				}
				
			}	// end switch
		}	// end while

	}	// end main

}	// end class
