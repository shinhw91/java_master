package todo.p20231128;

import java.util.Scanner;

import chap6.User;
import chap6.UserExe;

public class BoardApp {
	static BoardExe exe = new BoardExe();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String id = null;
		
		//		Board[] boards = new Board[100];
		
		UserExe uexe = new UserExe();
		
		while(true) {
			System.out.print("ID 입력 : ");
			id = sc.nextLine();
			System.out.print("PW 입력 : ");
			String pw = sc.nextLine();
			
			User user = uexe.logIn(id, pw);
			if(user != null) {
				System.out.println(user.getUserName() + "님 환영합니다");
				break;
			} else {
				System.out.println("ID, PW를 확인하세요");
			}
		}	// 로그인 처리
		
		
		// 초기값 생성
		exe.initData();
		
		
		while(run) {
			System.out.println("1.등록 2.목록 3.상세조회 4.수정 5.삭제 6.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.println("<게시글 등록>");
//				System.out.print("번호 : ");
//				int number = Integer.parseInt(sc.nextLine());
				System.out.print("제목 : ");
				String title = sc.nextLine();
//				System.out.print("작성자 : ");
//				String writer = sc.nextLine();
				System.out.print("내용 : ");
				String contents = sc.nextLine();
				System.out.print("작성일시 : ");
				String date = sc.nextLine();

				Board board = new Board(exe.getSequence(), title, id, contents, date);

//				for(int i = 0; i < boards.length; i++) {
//					if(boards[i] == null) {
//						boards[i] = board;
//						break;
//					}
//				}
				
				if(exe.addBoard(board)) {
					System.out.println("입력 성공!");
				} else {
					System.out.println("처리 실패!");
				}
				break;
				
			case 2 :	// 목록보기 -> 페이지보기
//				for(int i = 0; i < boards.length; i++) {
//					if(boards[i] != null) {
//						boards[i].showList();
//					}
//				}
				
				Board[] boardAry = exe.boardList();
				showList(boardAry, 1);
				while(true) {
					int page = Integer.parseInt(sc.nextLine());
					if(page == 0) {
						break;
					}
					showList(boardAry, page);
				}
				break;
				
			case 3 :
				System.out.println("상세조회 게시글 번호 : ");
				int number = Integer.parseInt(sc.nextLine());
				
//				for(int i = 0; i < boards.length; i++) {
//					if(boards[i] != null && boards[i].getBoardNum() == number) {
//						boards[i].showAllInfo();
//					}
//				}
				
				Board result = exe.getBoard(number);
				if(result != null) {
//					result.showAllInfo();
					System.out.println(result.showDetailInfo());
				} else {
					System.out.println("조회된 내용이 없습니다");
				}
				break;

			case 4 :	// 수정
				System.out.println("수정할 게시글 번호 :");
				number = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 내용 : ");
				contents = sc.nextLine();
				// 권한 체크
				if(!exe.checkResponsibility(id, number)){
					System.out.println("권한이 없습니다 ...");
					continue;
				}
				
				if(exe.modBoard(number, contents)) {
					System.out.println("수정 완료!");
				} else {
					System.out.println("수정 실패!");
				}
				break;
				
			case 5 :
				System.out.println("삭제할 게시글 번호 :");
				number = Integer.parseInt(sc.nextLine());
				// 권한 체크
				if(!exe.checkResponsibility(id, number)){
					System.out.println("권한이 없습니다 ...");
					continue;
				}
				
				if(exe.remBoard(number)) {
					System.out.println("삭제 완료!");
				} else {
					System.out.println("삭제 실패!");
				}
				break;
				
			case 6 :
				System.out.println("프로그램을 종료합니다");
				run = false;
				
				
			}	// end switch
		}	// end while
		System.out.println("end of prog");

	}	// end main
	
	public static void showList(Board[] boardAry, int page) {
		// 페이징 처리
		Board[] pageAry = exe.pageList(boardAry, page);
		System.out.println("글번호 제목\t 작성자");
		System.out.println("====================");
//		for(Board brd : boardAry) {
		for(Board brd : pageAry) {	
			if(brd != null) {
				System.out.println(brd.showInfo());
			}
		}
		
		// 전체페이지 계산하고 출력
		int cnt = exe.getBoardCount();
		int totalPage = (int) Math.ceil(cnt / 5.0);
		
		for(int i = 1; i <= totalPage; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n페이지 선택 : (종료를 원하시면 0을 입력하세요)");
	}

} // end class
