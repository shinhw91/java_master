package todo.p20231128;
// 깃허브 충돌 test
// 나도 변경 test

public class Board {
	// 속성(필드)
	private int boardNum;
	private String title;
	private String writer;
	private String contents;
	private String date;
	
	
	// 생성자
	Board(int boardNum, String title, String writer, String contents, String date){
		this.boardNum = boardNum;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.date = date;
	}
	
	
	// 기능(메소드)
	void showList() {
		System.out.println(boardNum + " " + title + " " + writer);
	}
	
	void showAllInfo() {
		System.out.println("번호 : " + boardNum + " / 제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("내용 : " + contents);
		System.out.println("일시 : " + date);
	}
	
	
	// setter
	void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	void setTitle(String title) {
		this.title = title;
	}

	void setWriter(String writer) {
		this.writer = writer;
	}

	void setContents(String contents) {
		this.contents = contents;
	}

	void setDate(String date) {
		this.date = date;
	}
	
	
	// getter
	int getBoardNum() {
		return boardNum;
	}

	String getTitle() {
		return title;
	}
	
	String getWriter() {
		return writer;
	}
	
	String getContents() {
		return contents;
	}
	
	String getDate() {
		return date;
	}
	
	
}	// end class
