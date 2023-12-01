package todo.p20231201;

public class CalendarExe {

	public static void main(String[] args) {
		// 12월 달력 작성
		String[] days = {"Sun", "Mon", "Thu", "Wed", "Thr", "Fri", "Sat"};
		
		for(String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();
		
		// 빈공백 생성
		int blank = 5;
		for(int i = 0; i < blank; i++) {
			System.out.printf("%4s", "");
		}
		
		for(int i = 1; i <= 31; i++) {
			System.out.printf("%4d", i);
			if((i + blank) % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n=========== the end ============");
		
		
		
		
	}	// end main
}	// end class
